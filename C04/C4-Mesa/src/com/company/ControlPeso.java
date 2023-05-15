package com.company;

public class ControlPeso extends CompruebaCalidad {
    @Override
    public String comprobar(Articulo articulo) {
        if (articulo.getPeso() >= 1200 && articulo.getPeso() <= 1300) {
            System.out.println("Aceptado - Peso.");
            return getSiguienteControl().comprobar(articulo);
        } else {
            System.out.println("El articulo ha sido rechazado por no cumplir con el estandar de peso.");
            return "Rechazado - Peso.";
        }
    }
}
