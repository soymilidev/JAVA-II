package clinica.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Bd {
    private final static String DRIVER = "org.h2.Driver";
    private final static String URL = "jdbc:h2:~/c15";
    private final static String USER = "sa";
    private final static String PASS = "sa";

    //Cuando se ejecuta una sentencia INSERT en una tabla que tiene una columna con una propiedad de autoincremento
    //o generación automática de claves, es posible que la clinica.bd genere una clave única para el nuevo registro. ---> Statement.RETURN_GENERATED_KEYS
    private final static String SQL_DROP_CREATE_DOMICILIOS = "DROP TABLE IF EXISTS DOMICILIOS;" +
            "CREATE TABLE DOMICILIOS (ID BIGINT AUTO_INCREMENT PRIMARY KEY," +
            "CALLE VARCHAR(100) NOT NULL, NUMERO VARCHAR(100) NOT NULL, LOCALIDAD VARCHAR(100) NOT NULL, " +
            "PROVINCIA VARCHAR(100) NOT NULL)";

    private final static String SQL_DROP_CREATE_PACIENTES = "DROP TABLE IF EXISTS PACIENTES;" +
            "CREATE TABLE PACIENTES (ID BIGINT AUTO_INCREMENT PRIMARY KEY, NOMBRE VARCHAR(100) NOT NULL, " +
            "APELLIDO VARCHAR(100) NOT NULL, DOCUMENTO VARCHAR(100) NOT NULL, FECHA_INGRESO DATE NOT NULL, " +
            "DOMICILIO_ID INT)";
    //DOMICILIO_ID: relación entre las tablas PACIENTES y DOMICILIOS.

    private final static String SQL_PRUEBA = "INSERT INTO DOMICILIOS (CALLE, NUMERO, LOCALIDAD, PROVINCIA) " +
            "VALUES('Avenida Libertador','1234','San Isidro','Buenos Aires'), " +
            "('Calle San Martin','742','Bella Vista','Buenos Aires'); " +
            "INSERT INTO PACIENTES (NOMBRE, APELLIDO, DOCUMENTO, FECHA_INGRESO, DOMICILIO_ID) " +
            "VALUES('Luis','Garcia','12345678','2023-05-01',1)," +
            "('Maria','Lopez','87654321','2023-05-02',2)";

    public static Connection getConnection() throws Exception {
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL, USER, PASS);
    }

    public static void crearTablas() {
        Connection connection = null;
        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_DROP_CREATE_DOMICILIOS);
            statement.execute(SQL_DROP_CREATE_PACIENTES);
            statement.execute(SQL_PRUEBA);
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
}
