package com.company;

//Las clases del subsistema no conocen la existencia de la fachada. Operan dentro del sistema y trabajan entre sí directamente.
public class ApiCantidad {
    public int descuento(int cantidad) {
        if (cantidad > 12) {
            return 15;
        }
        return 0;
    }
}
