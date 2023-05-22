package com.company;

import org.apache.log4j.Logger;

import java.sql.*;

public class Cliente {
    private static final String SQL_DROP_SELECT = "DROP TABLE IF EXISTS empleado;" +
            "CREATE TABLE empleado (Id INT PRIMARY KEY, Nombre VARCHAR(100), Apellido VARCHAR(100)," +
            " Edad INT, esSoltero BOOLEAN)";
    private static final String SQL_INSERT = "INSERT INTO empleado (Id, Nombre, Apellido, Edad, esSoltero) " +
            "VALUES (1, 'Juan', 'Pérez', 25, true), " +
            "(2, 'María', 'Gómez', 30, false), " +
            "(1, 'Pedro', 'López', 28, true)";
    private static final String SQL_UPDATE = "UPDATE empleado SET Edad = 31 WHERE Id = 2";
    private static final String SQL_DELETE_ID = "DELETE FROM empleado WHERE Id = 1";
    private static final String SQL_DELETE_EDAD = "DELETE FROM empleado WHERE Edad = 28";
    private static final Logger LOGGER = Logger.getLogger(Cliente.class);

    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_DROP_SELECT);

            try {
                statement.execute(SQL_INSERT);
            } catch (SQLException e) {
                LOGGER.error("Error al agregar empleado: " + e.getMessage());
                System.out.println();
            }

            ResultSet rs = statement.executeQuery("SELECT * FROM empleado");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("Id") +
                        " | Nombre: " + rs.getString("Nombre") +
                        " | Apellido: " + rs.getString("Apellido") +
                        " | Edad: " + rs.getInt("Edad") +
                        " | esSoltero: " + rs.getBoolean("esSoltero"));
            }

            // Actualizar empleado y loguear con DEBUG
            statement.execute(SQL_UPDATE);
            LOGGER.debug("Informacion actualizada para el empleado con ID 2");
            System.out.println();
            rs = statement.executeQuery("SELECT * FROM empleado WHERE Id = 2");
            while (rs.next()) {
                LOGGER.debug("ID: " + rs.getInt("Id") +
                        " | Nombre: " + rs.getString("Nombre") +
                        " | Apellido: " + rs.getString("Apellido") +
                        " | Edad: " + rs.getInt("Edad") +
                        " | esSoltero: " + rs.getBoolean("esSoltero"));
            }

            // Eliminar empleado por ID y loguear con INFO
            statement.execute(SQL_DELETE_ID);
            LOGGER.info("Empleado eliminado con ID 1");
            System.out.println();
            rs = statement.executeQuery("SELECT * FROM empleado");
            while (rs.next()) {
                LOGGER.info("ID: " + rs.getInt("Id") +
                        " | Nombre: " + rs.getString("Nombre") +
                        " | Apellido: " + rs.getString("Apellido") +
                        " | Edad: " + rs.getInt("Edad") +
                        " | esSoltero: " + rs.getBoolean("esSoltero"));
            }

            // Eliminar empleado por edad y loguear con INFO
            statement.execute(SQL_DELETE_EDAD);
            LOGGER.info("Empleado eliminado por edad");
            System.out.println();
            rs = statement.executeQuery("SELECT * FROM empleado");
            while (rs.next()) {
                LOGGER.info("ID: " + rs.getInt("Id") +
                        " | Nombre: " + rs.getString("Nombre") +
                        " | Apellido: " + rs.getString("Apellido") +
                        " | Edad: " + rs.getInt("Edad") +
                        " | esSoltero: " + rs.getBoolean("esSoltero"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/clase12-mesa", "luna", "luna");
    }
}
