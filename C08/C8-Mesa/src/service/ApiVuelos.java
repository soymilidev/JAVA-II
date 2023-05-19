package service;

import java.util.Date;

public class ApiVuelos {
    public void busquedaVuelos(String origen, String destino, Date fechaSalida, Date fechaRegreso) {
        // Lógica de búsqueda de vuelos
        System.out.println("BUSQUEDA DE VUELOS:");
        System.out.println("Fecha de salida: " + fechaSalida);
        System.out.println("Fecha de regreso: " + fechaRegreso);
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println();

        // Mostrar vuelos disponibles
        System.out.println("Vuelos disponibles:");
        System.out.println("- Vuelo 1");
        System.out.println("- Vuelo 2");
        System.out.println("- Vuelo 3");
        System.out.println();
    }
}
