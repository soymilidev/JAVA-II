package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ArbolFactory {
    private static Map<String, Arbol> mapaArbol = new HashMap<>();
    private static Integer contador = 0;
    private static Integer contador2 = 0;

    public static Arbol obtenerArbol(final String tipoArbol, final int alto, final int ancho, final String color) {
        Arbol arbol = mapaArbol.get(tipoArbol);
        if (Objects.isNull(arbol)) {
            arbol = new Arbol(alto, ancho, color, tipoArbol);
            mapaArbol.put(tipoArbol, arbol);
            contador++;
            System.out.println(contador);
            return arbol;
        }
        contador2++;

        return arbol;
    }
}
