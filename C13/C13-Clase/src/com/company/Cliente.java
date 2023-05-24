package com.company;

import java.sql.*;

public class Cliente {
    //2 - Declarar atributos SQL (CREATE, INSERT, UPDATE, SELECT)
    //SQL_DROP_CREATE: Eliminar y crear una base de dato
    //NUMERIC(10,2) ---> match con Double: Hasta 8 enteros, 2 decimales
    private static final String SQL_DROP_CREATE = "DROP TABLE IF EXISTS CUENTAS; " +
            "CREATE TABLE CUENTAS (ID INT PRIMARY KEY, NOMBRE VARCHAR(100) NOT NULL, NUM_CUENTA INT NOT NULL, SALDO NUMERIC(10,2) NOT NULL )";
    private static final String SQL_INSERT = "INSERT INTO CUENTAS VALUES(?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE CUENTAS SET SALDO=? WHERE ID=?";
    private static final String SQL_SELECT = "SELECT * FROM CUENTAS";


    //3 - Metodo main para poder ejecutar todooo
    public static void main(String[] args) {
        //A. Inicializar la conexion en null. Es una buena práctica inicializar las variables antes de utilizarlas.
        Connection connection = null;
        //B. Para hacer la conexion tendriamos que capturarla en un try & catch porque podria lanzar una excepcion.
        try {
            //Conectarme a la bdd
            connection = getConnection();

            //Crear la tabla
            Statement statement = connection.createStatement();
            statement.execute(SQL_DROP_CREATE);

            //Insertar valores, llamamos al metodo SQL_INSERT
            //PreparedStatement se utiliza para ejecutar consultas SQL con parametros.
            PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT);

            //Cargar los valores 1 a 1, tienen dos parametros: index y valor del index
            psInsert.setInt(1, 1);
            psInsert.setString(2, "Lisa Simpson");
            psInsert.setInt(3, 1234567);
            psInsert.setDouble(4, 300);
            psInsert.execute();

            //Actualizar saldo +10
            PreparedStatement psUpdate = connection.prepareStatement(SQL_UPDATE);
            //Si no tengo el saldo, hay que recorrer, traer el valor, guardarlo en algun atributo y ahi sumarlo al atributo.
            //"UPDATE CUENTAS SET SALDO=? WHERE ID=?";
            //Saldo en ubicacion 1, id en ubicacion 2 ---> ubicacion en la consulta, no en la tabla.
            psUpdate.setDouble(1, 300 + 10);
            psUpdate.setInt(2, 1);
            psUpdate.execute();


            //Aqui volveria el rollback (hacia atras). El rollback lo crea antes de la excepcion.
            //setAutoCommit(false) ---> hago una pausa, desactivo los commit, no enviar a la bdd aun.
            //Con false ejecuta pero NO envia a la bdd.
            connection.setAutoCommit(false);
            //Actualizo el saldo dentro de una transacción
            //tx = transaccion
            PreparedStatement ps_tx = connection.prepareStatement(SQL_UPDATE);
            ps_tx.setDouble(1, 300 + 10 + 15);
            ps_tx.setInt(2, 1);
            ps_tx.execute();

            //Prueba de excepcion
            //int x=0; //<--- cualquier division por 0, nos da error

            //Confirmar el cambio en la bdd
            connection.commit();
            //Buena practica, volver a ponerlo en true (si no, queda en false)
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
    //Al ser un método, es una mejor practica que este al final.
    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/C13-Clase", "sa", "sa");
    }
}


//2
    /*
    private static final String SQL_DROP_CREATE = "DROP TABLE IF EXISTS CUENTAS; " +
            "CREATE TABLE CUENTAS (ID INT PRIMARY KEY, NOMBRE VARCHAR(100) NOT NULL, NUM_CUENTA INT NOT NULL, SALDO NUMERIC(10,2) NOT NULL )";
    private static final String SQL_INSERT = " ";
    private static final String SQL_UPDATE = " ";
    private static final String SQL_SELECT = " ";
     */

//3
    /*
public static void main(String[] args) {
    Connection connection = null;
    try {

    } catch () {

        try {

            }
        } catch () {

        }
    } finally {
        try {

        } catch () {

        }
    }
*/