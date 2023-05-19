package service;
import java.util.Date;


public class ApiHoteles {
    public void busquedaHoteles(String nombre, String ciudad, Date fechaEntrada, Date fechaSalida) {
        // Lógica de búsqueda de hoteles
        System.out.println("BUSQUEDA DE HOTELES:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Fecha de entrada: " + fechaEntrada);
        System.out.println("Fecha de salida: " + fechaSalida);
        System.out.println();

        // Mostrar hoteles disponibles
        System.out.println("Hoteles disponibles:");
        System.out.println("- Hotel 1");
        System.out.println("- Hotel 2");
        System.out.println("- Hotel 3");
        System.out.println();
    }
}
