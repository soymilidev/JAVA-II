package service;

import model.Hotel;
import model.Vuelo;

import java.util.Date;
import java.util.List;

public class BusquedaFacade implements IBusquedaFacade {
    private ApiVuelos apiVuelos;
    private ApiHoteles apiHoteles;

    public BusquedaFacade() {
        apiVuelos = new ApiVuelos();
        apiHoteles = new ApiHoteles();
    }

    public void busqueda(String origen, String destino, Date fechaSalida, Date fechaRegreso) {
        apiVuelos.busquedaVuelos(origen, destino, fechaSalida, fechaRegreso);
        apiHoteles.busquedaHoteles(origen, destino, fechaSalida, fechaSalida);
    }
}
