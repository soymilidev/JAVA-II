package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Cliente {
    //1. Establezco una conexión a una base de datos H2.
    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/clase12", "sa", "sa");
    }


    // 2 y 3. Defino y ejecuto una consulta SQL para crear una tabla "FIGURAS" con tres columnas:
    // "ID" (INT), "NOMBRE" (VARCHAR) y "TIPO" (VARCHAR).
    // Inserto 5 filas en la tabla FIGURAS, con diferentes valores para las columnas "ID", "NOMBRE" y "TIPO".
    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS FIGURAS;" +
            " CREATE TABLE FIGURAS (ID INT PRIMARY KEY, NOMBRE VARCHAR(100) NOT NULL," +
            "TIPO VARCHAR(100) NOT NULL)";
    private static final String SQL_INSERT =
            "INSERT INTO FIGURAS VALUES "
                    + "(1,'Circulo','Rojo'),"
                    + "(2,'Circulo','Rojo'),"
                    + "(3,'Cuadrado','Azul'),"
                    + "(4,'Cuadrado','Azul'),"
                    + "(5,'Cuadrado','Azul')";
    private static final String SQL_DELETE = "DELETE FROM FIGURAS WHERE ID=2";


    //3
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);
            statement.execute(SQL_INSERT);
            verFiguras(connection);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    // Método "verFiguras" para mostrar todas las filas de la tabla FIGURAS.
    // "verFiguras" utiliza un bucle while para recorrer los resultados y mostrarlos.
    private static void verFiguras(Connection connection) throws Exception {
        String sql1 = "SELECT * FROM FIGURAS";
        String sql2 = "SELECT * FROM FIGURAS WHERE NOMBRE = 'Circulo' AND TIPO = 'Rojo'";
        Statement statement = connection.createStatement();

        // Consulta 1
        ResultSet resultSet = statement.executeQuery(sql1);
        //El ciclo recorre toda la tabla, compuesto por 3 columnas y c/u tiene una fila. Recorre fila a fila,
        // resultSet.next() te mueve de una fila a otra.
        while (resultSet.next()) {
            //resultSet.getInt --> Integer. Le podes pasar el numero o el nombre de la columna.
            System.out.println(resultSet.getInt(1) + "-" + resultSet.getString(2)
                    + "-" + resultSet.getString(3));
        }

        // Consulta 2
        ResultSet resultSet2 = statement.executeQuery(sql2);
        System.out.println("Círculos de color rojo:");
        while (resultSet2.next()) {
            System.out.println(resultSet2.getInt(1) + "-" + resultSet2.getString(2)
                    + "-" + resultSet2.getString(3));
        }
    }
}
