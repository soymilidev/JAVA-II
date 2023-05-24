package com.company.dao;

import com.company.entities.Estudiante;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//IDao para <Estudiante>
public class EstudianteDAOH2 implements IDao<Estudiante> {
    // Nombre
    // Apellido
    // Id

    // Crear sentencias
    private static final String SQL_INSERT = "INSERT INTO Estudiantes VALUES (?,?,?)";
    private static final String SQL_DELETE = "DELETE FROM Estudiantes WHERE Id = ?";
    private static final String SQL_SELECT_ID = "SELECT * FROM Estudiantes WHERE Id = ?";

    private static final String SQL_SELECT_TODOS = "SELECT * FROM Estudiantes";

    private static final Logger LOGGER = Logger.getLogger(EstudianteDAOH2.class);

    @Override
    public Estudiante guardar(Estudiante estudiante) {
        LOGGER.info("Guardando un estudiante...");
        Connection connection = null;

        try {
            // 1 Conectarme a la base de datos
            connection = Bd.getConnection();

            // 2 Crear
            PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT);
            psInsert.setLong(1, estudiante.getId());
            psInsert.setString(2, estudiante.getNombre());
            psInsert.setString(3, estudiante.getApellido());

            // Ejecutar
            psInsert.execute();
            LOGGER.info("Guardado.");

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                connection.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return estudiante;
    }

    @Override
    public Estudiante eliminar(Long id) {
        LOGGER.info("Eliminando un estudiante...");
        Connection connection = null;
        String nombreEliminado = null;
        String apellidoEliminado = null;

        try {
            // 1 Conectarme a la base de datos
            connection = Bd.getConnection();

            // 2 Crear
            //Alcanza con mandarle solo el id, no el objeto estudiante
            PreparedStatement ps = connection.prepareStatement(SQL_DELETE);
            ps.setLong(1, id);

            // Ejecutar (!!!)
            ps.executeUpdate();
            //ps.close();
            LOGGER.info("Eliminado estudiante(id): " + id);

            // Obtener nombre y apellido del estudiante eliminado
            PreparedStatement psSelect = connection.prepareStatement(SQL_SELECT_ID);
            psSelect.setLong(1, id);

            ResultSet resultadoSelect = psSelect.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                connection.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Estudiante buscar(Long id) {
        LOGGER.info("Buscar estudiante...");
        Connection connection = null;
        Estudiante estudiante = null;

        try {
            // 1 Conectarme a la base de datos
            connection = Bd.getConnection();

            // 2 Crear
            PreparedStatement ps = connection.prepareStatement(SQL_SELECT_ID);
            ps.setLong(1, id);

            // Ejecutar
            // La consulta nos va a DEVOLVER un RESULTADO que son muchos registros. Vamos a ejecutar una consulta ---> executeQuery()
            ResultSet resultado = ps.executeQuery();
            //ps.close();

            //List<String> resultadosBusqueda = new ArrayList<>();
            // 4 Evaluar resultados, recorrerlos
            // El estudiante va a estar en nulo (Estudiante estudiante = null;) pero si se encuentra el registro, a este estudiante lo voy a instanciar
            while (resultado.next()) {
                Long idEstudiante = resultado.getLong("id");
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                estudiante = new Estudiante();
                estudiante.setId(idEstudiante);
                estudiante.setNombre(nombre);
                estudiante.setApellido(apellido);

                //resultadosBusqueda.add(nombre + " " + apellido);

                LOGGER.info("El resultado de la busqueda es: " + resultado.getString("nombre") + " " + resultado.getString("apellido"));
            }
            //LOGGER.info("Resultados de la búsqueda: " + resultadosBusqueda);

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                connection.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return estudiante;
    }

    @Override
    public List<Estudiante> buscarTodos() {
        LOGGER.info("Buscar todos los estudiantes...");
        Connection connection = null;
        List<Estudiante> estudiantes = new ArrayList<>();

        try {
            // 1 Conectarme a la base de datos
            connection = Bd.getConnection();

            // 2 Crear
            PreparedStatement ps = connection.prepareStatement(SQL_SELECT_TODOS);

            // Ejecutar
            ResultSet resultado = ps.executeQuery();
            //ps.close();

            // 4 Evaluar resultados, recorrerlos
            while (resultado.next()) {
                Long idEstudiante = resultado.getLong("id");
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");

                Estudiante estudiante = new Estudiante();
                estudiante.setId(idEstudiante);
                estudiante.setNombre(nombre);
                estudiante.setApellido(apellido);

                estudiantes.add(estudiante);

                LOGGER.info("El resultado de la busqueda es: " + resultado.getString("nombre") + " " + resultado.getString("apellido"));
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
        return estudiantes;
    }
}
