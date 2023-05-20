package com.company;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraListaEnteros {
    //static = el atributo va a pertenecer a la clase lista y no al objeto.
    //final = se va a convertir en una constante (como el numero pi, siempre va a ser el mismo).
    //Asociar al log4j para eso creo (seleccionar logger de Apache):
    //El logger va a funcionar exclusivamente para la clase que lo tomo.
    private static final Logger logger = Logger.getLogger(CalculadoraListaEnteros.class);

    private List<Integer> listaEnteros;

    //Este constructor garantiza que siempre se tenga una lista válida al inicializarla con una lista vacía.
    public CalculadoraListaEnteros() {
        listaEnteros = new ArrayList<>();
    }

    /*
    //Este constructor puede llevar a problemas si se pasa null como argumento.
    public Lista(List<Integer> listaEnteros) {
        this.listaEnteros = listaEnteros;
    }
    */
    public void agregarEntero(Integer numero) {
        listaEnteros.add(numero);
        if (listaEnteros.size() == 0) {
            //necesito logger, necesito guardarlo en mi bitacora
            //logger de tipo ERROR.
            logger.error("La lista no tiene elementos");
        }
        if (listaEnteros.size() > 0 && listaEnteros.size() > 5) {
            //necesito logger, necesito guardarlo en mi bitacora
            //logger de tipo INFO.
            logger.info("La lista tiene " + listaEnteros.size() + " elementos, supera los 5 elementos");
        }
        if (listaEnteros.size() > 10) {
            //necesito logger, necesito guardarlo en mi bitacora
            //logger de tipo INFO.
            logger.info("La lista tiene " + listaEnteros.size() + " elementos, supera los 10 elementos");
        }

        int suma = 0;

        for (int entero : listaEnteros) {
            suma += entero;
        }

        double promedio = (double) suma / listaEnteros.size();

        logger.info("Promedio: " + promedio);
    }
}
