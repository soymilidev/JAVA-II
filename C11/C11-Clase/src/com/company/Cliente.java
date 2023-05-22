package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//Representamos al cliente.
//Conectarme a la base de datos


public class Cliente {
    //PASO 1: Un metodo que me traiga la conexion, uso la clase Connection.
    //¿Qué pasa si no encontramos la clase? ---> arroja una excepcion.
    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        //retorno una conexion. Parametros: url, usuario, contraseña. El nombre de la base de datos es "clase11"
        return DriverManager.getConnection("jdbc:h2:~/clase11", "sa", "sa");
    }


    //PASO 2: creacion de tabla
    //a. DROP ---> borrar la tabla si es que existe. Siempre que la estoy cargando comienzo de cero.
    //b. creo la tabla y escribo los campos. ID va a ser la clave primaria (PRIMARY KEY), nombre y tipo van a ser VARCHAR(X) NOT NULL)
    //Voy a enviar este SQL a la base de datos.

    //INSERT ---> insercion de un elemento.
    //DELETE ---> recordar el WHERE
    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS ANIMALES;" +
            " CREATE TABLE ANIMALES (ID INT PRIMARY KEY, NOMBRE VARCHAR(100) NOT NULL," +
            "TIPO VARCHAR(100) NOT NULL)";
    private static final String SQL_INSERT = "INSERT INTO ANIMALES VALUES (1,'Pancho','Perro')," +
            "(2,'Pepe','Gato')";
    private static final String SQL_DELETE = "DELETE FROM ANIMALES WHERE ID=2";


    //PASO 3: enviar a la base de datos. Escribo un main para poder ejecutar.
    //finally ---> cerrar la conexion.
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);
            statement.execute(SQL_INSERT);
            verAnimales(connection);
            statement.execute(SQL_DELETE);
            verAnimales(connection);
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

    private static void verAnimales(Connection connection) throws Exception {
        //Recibimos una tabla con elementos (no un sql) hay que procesarlo
        String sql = "SELECT * FROM ANIMALES";
        Statement statement = connection.createStatement();
        //Trabajamos la tabla con ResultSet (conjunto de resultados).
        ResultSet resultSet = statement.executeQuery(sql);
        //El ciclo recorre toda la tabla, compuesto por 3 columnas y c/u tiene una fila. Recorre fila a fila,
        // resultSet.next() te mueve de una fila a otra.
        while (resultSet.next()) {
            //resultSet.getInt --> Integer. Le podes pasar el numero o el nombre de la columna.
            System.out.println(resultSet.getInt(1) + "-" + resultSet.getString(2)
                    + "-" + resultSet.getString(3));
        }
    }
}
