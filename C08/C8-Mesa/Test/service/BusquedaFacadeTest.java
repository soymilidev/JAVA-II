package service;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BusquedaFacadeTest {

    @Test
    public void testBusqueda() {
        // Arrange
        BusquedaFacade busquedaFacade = new BusquedaFacade();
        Date fechaSalida = new Date(2023 - 1900, 4, 19);
        Date fechaRegreso = new Date(2023 - 1900, 4, 27);

        // Act
        busquedaFacade.busqueda("Buenos Aires", "New York", fechaSalida, fechaRegreso);

        // Assert
        String esperado = "BUSQUEDA DE VUELOS:\n" +
                "Fecha de salida: " + fechaSalida + "\n" +
                "Fecha de regreso: " + fechaRegreso + "\n" +
                "Origen: Buenos Aires\n" +
                "Destino: New York\n" +
                "\n" +
                "Vuelos disponibles:\n" +
                "- Vuelo 1\n" +
                "- Vuelo 2\n" +
                "- Vuelo 3\n" +
                "\n" +
                "BUSQUEDA DE HOTELES:\n" +
                "Nombre: Buenos Aires\n" +
                "Ciudad: New York\n" +
                "Fecha de entrada: " + fechaSalida + "\n" +
                "Fecha de salida: " + fechaSalida + "\n" +
                "\n" +
                "Hoteles disponibles:\n" +
                "- Hotel 1\n" +
                "- Hotel 2\n" +
                "- Hotel 3\n" +
                "\n";

        // Verificar que la salida contiene el resultado esperado
        assertTrue(esperado.contains("BUSQUEDA DE VUELOS"));
        assertTrue(esperado.contains("BUSQUEDA DE HOTELES"));
    }
}
