package com.company.dao;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//Todooo lo que preciso para crear las tablas
public class Bd {
    //    Nombre
    //    Apellido
    //    Id
    private static final String SQL_DROP_CREATE = "DROP TABLE IF EXISTS Estudiantes; " +
            "CREATE TABLE Estudiantes (Id BIGINT PRIMARY KEY, " +
            "Nombre VARCHAR(100) NOT NULL, " +
            "Apellido VARCHAR(100) NOT NULL)";
    private static final Logger LOGGER = Logger.getLogger(Bd.class);

    public static void crearTabla() {
        Connection connection = null;
        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_DROP_CREATE);
            LOGGER.info("Creacion de la tabla");
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

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/C14-Dh", "sa", "");
    }
}
