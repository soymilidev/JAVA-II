package model;

import java.util.Date;

// No son necesarias las clases Hoteles y Vuelos para probar la funcionalidad de BusquedaFacade.
// El punto central es verificar que la búsqueda combinada de hoteles y vuelos.

public class Hotel {
    private String nombre;
    private String ciudad;
    private Date fechaEntrada;
    private Date fechaSalida;

    public Hotel(String nombre, String ciudad, Date fechaEntrada, Date fechaSalida) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return "HOTEL: \n" +
                "Nombre: " + nombre +
                ", Ciudad: " + ciudad +
                ", Fecha Entrada: " + fechaEntrada +
                ", Fecha Salida: " + fechaSalida;
    }
}
