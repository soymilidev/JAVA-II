package com.company;

public class ControlLote extends CompruebaCalidad {
    @Override
    public String comprobar(Articulo articulo) {
        if (articulo.getLote() >= 1000 && articulo.getLote() <= 2000) {
            System.out.println("Aceptado - Lote.");
            return getSiguienteControl().comprobar(articulo);
        } else {
            System.out.println("El articulo ha sido rechazado por no cumplir con el estandar de lote.");
            return "Rechazado - Lote.";
        }
    }
}
