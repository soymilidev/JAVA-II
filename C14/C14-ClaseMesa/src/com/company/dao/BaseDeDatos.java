package com.company.dao;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//Todooo lo que preciso para crear las tablas
public class BaseDeDatos {
    //ID, CODIGO, NOMBRE, LABORATORIO, CANTIDAD, PRECIO
    private static final String SQL_DROP_CREATE = "DROP TABLE IF EXISTS Medicamentos; " +
            "CREATE TABLE Medicamentos (Id INT PRIMARY KEY, Codigo INT NOT NULL, Nombre VARCHAR(100) NOT NULL," +
            " Laboratorio VARCHAR(100) NOT NULL, Cantidad INT NOT NULL, Precio NUMERIC(10,2) NOT NULL)";

    private static final Logger LOGGER = Logger.getLogger(BaseDeDatos.class);

    public static void crearTabla() {
        Connection connection = null;
        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_DROP_CREATE);
            LOGGER.info("Se ha creado con exito la tabla");
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
        return DriverManager.getConnection("jdbc:h2:~/C14-Clase_", "sa", "sa");
    }
}
