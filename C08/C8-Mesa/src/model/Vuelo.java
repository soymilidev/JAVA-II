package model;

import java.util.Date;

// No son necesarias las clases Hoteles y Vuelos para probar la funcionalidad de BusquedaFacade.
// El punto central es verificar que la búsqueda combinada de hoteles y vuelos.
public class Vuelo {
    private String aerolinea;
    private String origen;
    private String destino;
    private Date fechaSalida;
    private Date fechaRegreso;

    public Vuelo(String aerolinea, String origen, String destino, Date fechaSalida, Date fechaRegreso) {
        this.aerolinea = aerolinea;
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.fechaRegreso = fechaRegreso;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(Date fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    @Override
    public String toString() {
        return "VUELO: \n" +
                "Aerolinea: " + aerolinea +
                ", Origen: " + origen +
                ", Destino: " + destino +
                ", Fecha Salida: " + fechaSalida +
                ", Fecha Regreso: " + fechaRegreso
                ;
    }
}
