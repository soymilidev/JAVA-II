package com.company.dao;

import com.company.model.Medicamento;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// Clase que implementa el IDao, sus metodos
public class MedicamentoDaoH2 implements IDao<Medicamento> {
    //ID, CODIGO, NOMBRE, LABORATORIO, CANTIDAD, PRECIO
    private static final String SQL_INSERT = "INSERT INTO Medicamentos VALUES (?,?,?,?,?,?)";
    // LOGGER ---> Todas las operaciones que realice hay que loguearlas

    private static final String SQL_SELECT_ID = "SELECT * FROM Medicamentos WHERE ID = ?";

    private static final Logger LOGGER = Logger.getLogger(MedicamentoDaoH2.class);

    @Override
    public Medicamento guardar(Medicamento medicamento) {
        //cargar, ejecutar y guardar el prepared statement
        LOGGER.info("Inicio de Operatoria de Guardado de un medicamento");
        Connection connection = null;

        try {
            //Conectarme a la base de datos
            //connection = getConnection(); ---> da error, tengo que traerla de la BdD
            connection = BaseDeDatos.getConnection();

            PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT);

            //ID, CODIGO, NOMBRE, LABORATORIO, CANTIDAD, PRECIO
            //medicamento.getId() ---> el medicamento me tiene que entregar el id para lo que quiero hacer.
            psInsert.setInt(1, medicamento.getId());
            psInsert.setInt(2, medicamento.getCodigo());
            psInsert.setString(3, medicamento.getNombre());
            psInsert.setString(4, medicamento.getLaboratorio());
            psInsert.setInt(5, medicamento.getCantidad());
            psInsert.setDouble(6, medicamento.getPrecio());
            //tenemos que ejecutarlo
            psInsert.execute();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                connection.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return medicamento;
    }

    @Override
    public Medicamento buscarPorId(int id) {
        LOGGER.info("Inicio de búsqueda de un medicamento por Id");
        Connection connection = null;
        try {
            // Conectarse a la base de datos
            connection = BaseDeDatos.getConnection();
            PreparedStatement psSelect = connection.prepareStatement(SQL_SELECT_ID);
            psSelect.setInt(1, id);

            ResultSet rsSelect = psSelect.executeQuery();

            while (rsSelect.next()) {
                LOGGER.info("El resultado de la busqueda es: " + rsSelect.getString("nombre"));
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
        return null;
    }
}