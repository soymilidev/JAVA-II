package com.company;

public class ApiProducto {
    public static int descuento(Producto producto) {
        // Debo preguntar si es una lata, para aplicar el descuento del 10%
        if (producto.getTipo().equals("latas")) {
            // Le otorgo el descuento
            return 10;
        } else {
            return 0;
        }
    }
}
