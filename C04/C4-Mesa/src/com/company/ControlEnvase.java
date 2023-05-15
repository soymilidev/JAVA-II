package com.company;

public class ControlEnvase extends CompruebaCalidad {
    @Override
    public String comprobar(Articulo articulo) {
        //if (articulo.getEnvasado().equals("sano") || articulo.getEnvasado().equals("casi sano"))
        if (!articulo.getEnvasado().equals("sano") && !articulo.getEnvasado().equals("casi sano")) {
            System.out.println("El articulo ha sido rechazado por no cumplir con el estandar de envase.");
            return "Rechazado - Envase.";
        } else {
            System.out.println("Aceptado - Envase. | El envase se encuentra sano o casi sano.");
            return "El articulo fue ACEPTADO. Cumple con todos los requisitos de calidad.";
        }
    }
}
