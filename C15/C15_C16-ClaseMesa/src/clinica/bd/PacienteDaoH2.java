package clinica.bd;

import clinica.dao.IDao;
import clinica.model.Domicilio;
import clinica.model.Paciente;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PacienteDaoH2 implements IDao<Paciente> {

    private static final String SQL_INSERT_PACIENTE = "INSERT INTO PACIENTES VALUES(?,?,?,?,?,?)";
    private static final String SQL_BUSCAR_PACIENTE = "SELECT * FROM PACIENTES WHERE ID = ?";
    private static final String SQL_MODIFICAR_PACIENTE = "UPDATE PACIENTES SET APELLIDO=?, NOMBRE=?, DNI=?, FECHA=? WHERE ID = ?";
    private static final String SQL_ELIMINAR_PACIENTE = "DELETE FROM PACIENTES WHERE ID = ?";
    private static final String SQL_LISTAR_PACIENTE = "SELECT * FROM PACIENTES";


    private static final Logger LOGGER = Logger.getLogger(DomicilioDaoH2.class);

    @Override
    public Paciente alta(Paciente paciente) {
        LOGGER.info("Se ha guardado un nuevo Paciente.");
        Connection connection = null;
        Domicilio domicilio = null;
        DomicilioDaoH2 domicilioAux = new DomicilioDaoH2();
        domicilio = domicilioAux.buscar(paciente.getDomicilio().getId());

        try {
            connection = Bd.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT_PACIENTE);

            preparedStatement.setLong(1, paciente.getId());
            preparedStatement.setString(2, paciente.getApellido());
            preparedStatement.setString(3, paciente.getNombre());
            preparedStatement.setString(4, paciente.getDni());
            //?
            preparedStatement.setDate(5, Date.valueOf(paciente.getFechaIngreso()));
            preparedStatement.setLong(6, domicilio.getId());
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return paciente;
    }

    @Override
    public Paciente buscar(Long id) {
        LOGGER.info("Iniciando operacion de busqueda del paciente por Id: " + id);
        System.out.println();

        Connection connection = null;
        //Almacenar los resultados de la búsqueda
        Paciente paciente = null;
        Domicilio domicilio = null;

        try {
            connection = Bd.getConnection();
            PreparedStatement psSelectOne = connection.prepareStatement(SQL_BUSCAR_PACIENTE);
            psSelectOne.setLong(1, id);
            ResultSet rsPaciente = psSelectOne.executeQuery();
            //DomicilioDAOH2 es el que actualiza, elimina a ese domicilio.
            //domAux, realiza operaciones relacionadas con los domicilios en la base de datos.
            DomicilioDaoH2 domAux = new DomicilioDaoH2();
            while (rsPaciente.next()) {
                //Dentro del bucle, se llama al método domAux.buscar() para buscar el domicilio asociado al paciente actual.
                //Se pasa el valor de la sexta columna (rsPaciente.getLong(6)) como argumento a este método.
                domicilio = domAux.buscar(rsPaciente.getLong(6));
                //Todooo lo que traigo de rsPaciente, lo tengo que cargar en un nuevo paciente.
                //De domicilio solo preciso la foreign key
                //VALUES(1,'Luz','Buena','123345','2023-05-24',5)<--FK
                paciente = new Paciente(rsPaciente.getLong(1), rsPaciente.getString(2),
                        rsPaciente.getString(3), rsPaciente.getString(4),
                        rsPaciente.getDate(5).toLocalDate(), domicilio);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return paciente;

    }

    @Override
    public void modificar(Paciente paciente) {
        LOGGER.info("Iniciando operación de actualizacion o modificacion del paciente por ID");
        System.out.println();

        Connection connection = null;

        try {
            connection = Bd.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_MODIFICAR_PACIENTE);
            //APELLIDO,NOMBRE,DNI(S),FECHA INGRESO
            preparedStatement.setString(1, paciente.getApellido());
            preparedStatement.setString(2, paciente.getNombre());
            preparedStatement.setDate(3, Date.valueOf(paciente.getFechaIngreso()));
            preparedStatement.setLong(4, paciente.getId());
            preparedStatement.execute();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void eliminar(Long id) {
        LOGGER.info("Iniciando operacion de eliminacion del paciente con ID: " + id);
        System.out.println();
        Connection connection = null;

        try {
            connection = Bd.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_ELIMINAR_PACIENTE);
            preparedStatement.setLong(1, id);
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<Paciente> listar() {
        LOGGER.info("Iniciando operacion de listado de todos los pacientes.");
        Connection connection = null;
        List<Paciente> pacientes = new ArrayList<>();
        Paciente paciente = null;
        Domicilio domicilio = null;

        try {
            connection = Bd.getConnection();
            PreparedStatement psSelectAll = connection.prepareStatement(SQL_LISTAR_PACIENTE);
            ResultSet rs = psSelectAll.executeQuery();
            DomicilioDaoH2 domAux = new DomicilioDaoH2();
            while (rs.next()) {
                domicilio = domAux.buscar(rs.getLong(6));
                paciente = new Paciente(rs.getLong(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getDate(5).toLocalDate(), domicilio);
                pacientes.add(paciente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return pacientes;
    }
}
