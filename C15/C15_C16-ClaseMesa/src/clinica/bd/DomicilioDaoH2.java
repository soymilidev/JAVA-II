package clinica.bd;

import clinica.dao.IDao;
import clinica.model.Domicilio;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DomicilioDaoH2 implements IDao<Domicilio> {
    private static final Logger LOGGER = Logger.getLogger(DomicilioDaoH2.class);

    //private static final String SQL_INSERT_DOMICILIO = "INSERT INTO DOMICILIOS VALUES (?,?,?)";
    //private static final String SQL_BUSCAR_DOMICILIO = "SELECT * FROM DOMICILIOS WHERE ID=?";
    //private static final String SQL_MODIFICAR_DOMICILIO = "UPDATE DOMICILIOS SET CALLE=?, NUMERO=? WHERE ID=?";
    //private static final String SQL_ELIMINAR_DOMICILIO = "DELETE FROM DOMICILIOS WHERE ID=?";
    //private static final String SQL_LISTAR_DOMICILIOS = "SELECT * FROM DOMICILIOS";

    @Override
    public Domicilio alta(Domicilio domicilio) {
        LOGGER.info("Se ha guardado un nuevo domicilio. Detalles del domicilio: " +
                domicilio.getCalle() + " " + domicilio.getNumero() + " | " + domicilio.getLocalidad() + " | " + domicilio.getProvincia());
        System.out.println();

        Connection connection = null;

        //Statement.RETURN_GENERATED_KEYS ---> se utiliza para indicar que se desean obtener las claves generadas automáticamente
        //al realizar una inserción en la Bd
        try {
            connection = Bd.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO DOMICILIOS " +
                    "(CALLE, NUMERO, LOCALIDAD, PROVINCIA) VALUES (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, domicilio.getCalle());
            preparedStatement.setString(2, domicilio.getNumero());
            preparedStatement.setString(3, domicilio.getLocalidad());
            preparedStatement.setString(4, domicilio.getProvincia());
            preparedStatement.execute();
            //obtener el conjunto de claves generadas llamando al método getGeneratedKeys()
            ResultSet clave = preparedStatement.getGeneratedKeys();
            //clave = generatedKeys
            while (clave.next()) {
                domicilio.setId(clave.getLong(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return domicilio;
    }


    @Override
    public Domicilio buscar(Long id) {
        LOGGER.info("Iniciando operacion de busqueda de domicilio por Id: " + id);
        System.out.println();

        Connection connection = null;
        Domicilio domicilio = null;

        //consulta a la BdD para obtener un registro de la tabla "DOMICILIOS" que coincida con un ID
        try {
            connection = Bd.getConnection();
            //PreparedStatement ---> una forma de ejecutar consultas SQL
            PreparedStatement psSelect = connection.prepareStatement("SELECT * FROM DOMICILIOS WHERE ID=?");
            psSelect.setLong(1, id);
            ResultSet rsDomicilio = psSelect.executeQuery();

            while (rsDomicilio.next()) {
                domicilio = new Domicilio(rsDomicilio.getLong(1), rsDomicilio.getString(2),
                        rsDomicilio.getString(3), rsDomicilio.getString(4), rsDomicilio.getString(5));
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
        return domicilio;
    }


    @Override
    public void modificar(Domicilio domicilio) {
        LOGGER.info("Iniciando operación de actualizacion o modificacion del domicilio por ID: " + domicilio);
        System.out.println();

        Connection connection = null;
        try {
            connection = Bd.getConnection();
            PreparedStatement psUpdate = connection.prepareStatement(
                    "UPDATE DOMICILIOS SET CALLE=?, NUMERO=?, LOCALIDAD=?, PROVINCIA=? WHERE ID =?");
            psUpdate.setString(1, domicilio.getCalle());
            psUpdate.setString(2, domicilio.getNumero());
            psUpdate.setString(3, domicilio.getLocalidad());
            psUpdate.setString(4, domicilio.getProvincia());
            psUpdate.setLong(5, domicilio.getId());
            psUpdate.execute();

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
        LOGGER.info("Iniciando operacion de eliminacion del domicilio con ID: " + id);

        Connection connection = null;
        try {
            connection = Bd.getConnection();
            PreparedStatement psDelete = connection.prepareStatement("DELETE FROM DOMICILIOS WHERE ID=?");
            psDelete.setLong(1, id);
            psDelete.execute();

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
    public List<Domicilio> listar() {
        LOGGER.info("Iniciando operación de listado de todos los domicilios");

        Connection connection = null;
        List<Domicilio> domicilios = new ArrayList<>();
        Domicilio domicilio = null;
        try {
            connection = Bd.getConnection();
            PreparedStatement psSelectAll = connection.prepareStatement("SELECT * FROM DOMICILIOS");
            ResultSet rs = psSelectAll.executeQuery();
            while (rs.next()) {
                domicilio = new Domicilio(rs.getLong(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5));
                domicilios.add(domicilio);
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
        return domicilios;
    }
}
