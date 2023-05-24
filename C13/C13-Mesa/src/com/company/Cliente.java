package com.company;

import java.sql.*;

public class Cliente {
    //2 - Declarar atributos SQL (CREATE, INSERT, UPDATE, SELECT)
    private static final String SQL_DROP_CREATE = "DROP TABLE IF EXISTS Cliente; " +
            "CREATE TABLE Cliente (Id INT PRIMARY KEY, Apellido VARCHAR(100) NOT NULL, Nombre VARCHAR(100) NOT NULL, Matricula INT NOT NULL )";
    private static final String SQL_INSERT = "INSERT INTO Cliente VALUES(?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE Cliente SET Matricula=? WHERE Id=?";
    private static final String SQL_SELECT = "SELECT * FROM Cliente";


    //3 - Metodo main para poder ejecutar todooo
    public static void main(String[] args) {
        Connection connection = null;
        try {
            //Conectarme a la bdd
            connection = getConnection();

            //Crear la tabla
            Statement statement = connection.createStatement();
            statement.execute(SQL_DROP_CREATE);

            //Odontologo 1
            //Insertar valores, llamamos al metodo SQL_INSERT
            PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT);

            //Cargar los valores 1 a 1, tienen dos parametros: index y valor del index
            psInsert.setInt(1, 1);
            psInsert.setString(2, "Hibbert");
            psInsert.setString(3, "Julius");
            psInsert.setInt(4, 171717);
            psInsert.execute();

            //Odontologo 2
            //Insertar valores, llamamos al metodo SQL_INSERT
            PreparedStatement psInsert2 = connection.prepareStatement(SQL_INSERT);

            //Cargar los valores 1 a 1, tienen dos parametros: index y valor del index
            psInsert2.setInt(1, 2);
            psInsert2.setString(2, "Nick");
            psInsert2.setString(3, "Riviera");
            psInsert2.setInt(4, 121212);
            psInsert2.execute();

            //Actualizar Matricula
            PreparedStatement psUpdate = connection.prepareStatement(SQL_UPDATE);
            //"UPDATE Cliente SET Matricula=? WHERE Id=?"
            //Matricula en ubicacion 1, id en ubicacion 2 ---> ubicacion en la consulta, no en la tabla.
            psUpdate.setString(1, "333333");
            psUpdate.setInt(2, 1);
            psUpdate.execute();


            //mostrar mediante un RS
            //ResultSet permite TRAER
            ResultSet resultSet = statement.executeQuery(SQL_SELECT);

            while (resultSet.next()) {
                // Mostrar los datos en la consola
                System.out.println("ID: " + resultSet.getInt("Id"));
                System.out.println("Apellido: " + resultSet.getString("Apellido"));
                System.out.println("Nombre: " + resultSet.getString("Nombre"));
                System.out.println("Matricula: " + resultSet.getInt("Matricula"));
                System.out.println("---------------------------");
            }

            /*
            // Consulta para obtener los datos de los odontólogos
            PreparedStatement psSelect = connection.prepareStatement(SQL_SELECT);
            ResultSet resultSet = psSelect.executeQuery();

            // Recorrer los resultados con un while
            while (resultSet.next()) {
                int id = resultSet.getInt("Id");
                String apellido = resultSet.getString("Apellido");
                String nombre = resultSet.getString("Nombre");
                int matricula = resultSet.getInt("Matricula");

                // Mostrar los datos en la consola
                System.out.println("ID: " + id);
                System.out.println("Apellido: " + apellido);
                System.out.println("Nombre: " + nombre);
                System.out.println("Matricula: " + matricula);
                System.out.println("---------------------------");
            }

            // Cerrar el ResultSet y liberar recursos
            resultSet.close();
            */

            //Confirmar el cambio en la bdd
            connection.commit();
            connection.setAutoCommit(true);

        } catch (Exception e) {
            //Imprime y devuelve por consola.
            e.printStackTrace();
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException sql) {
                sql.printStackTrace();
            }
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

    //1 - Establecemos la conexion a la bdd
    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/C13-M", "sa", "sa");
    }
}