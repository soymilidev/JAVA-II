package com.company;

import java.util.HashMap;
import java.util.Map;

//Gestiona los tipos de árboles existentes.
public class ArbolFactory {
    private static Map<String, Arbol> arboles = new HashMap<>();

    public static Arbol getArbol(String tipo) {
        Arbol arbol = arboles.get(tipo);

        if (arbol == null) {
            switch (tipo) {
                case "Ornamentales":
                    arbol = new Arbol(200, 400, "verde", tipo);
                    break;
                case "Frutales":
                    arbol = new Arbol(500, 300, "rojo", tipo);
                    break;
                case "Florales":
                    arbol = new Arbol(100, 200, "celeste", tipo);
                    break;
                default:
                    throw new IllegalArgumentException("Tipo de árbol desconocido: " + tipo);
            }

            arboles.put(tipo, arbol);
        }

        return arbol;
    }
}
