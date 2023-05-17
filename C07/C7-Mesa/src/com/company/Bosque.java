package com.company;

// Conjunto de árboles.
public class Bosque {
    //private static final int NUM_ARBOLES = 1000000;
    private static final int CANTIDAD_ARBOLES = 10;

    public void plantarArboles() {
        for (int i = 0; i < CANTIDAD_ARBOLES / 2; i++) {
            Arbol arbol = ArbolFactory.getArbol("Frutales");
            arbol.mostrar();
        }

        for (int i = 0; i < CANTIDAD_ARBOLES / 2; i++) {
            Arbol arbol = ArbolFactory.getArbol("Ornamentales");
            arbol.mostrar();
        }
    }
}
