package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bosque {
    private static final List<Arbol> arboles = new ArrayList<>();

    public void plantarArbol(final String tipoArbol, final int alto, final int ancho, final String color) {
        final Arbol arbol = ArbolFactory.obtenerArbol(tipoArbol, alto, ancho, color);
        arboles.add(arbol);
    }

    public List<Arbol> getArboles() {
        return arboles;
    }
}
