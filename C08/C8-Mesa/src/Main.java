import service.BusquedaFacade;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear la instancia de la fachada utilizando la interfaz
        BusquedaFacade busquedaFacade = new BusquedaFacade();
        Date fechaSalida = new Date(2023 - 1900, 4, 19);
        Date fechaRegreso = new Date(2023 - 1900, 4, 27);

        // Realizar la búsqueda de vuelos y hoteles
        busquedaFacade.busqueda("Buenos Aires", "New York", fechaSalida, fechaRegreso);
    }
}
