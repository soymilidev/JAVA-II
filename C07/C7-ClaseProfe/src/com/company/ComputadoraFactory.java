package com.company;

import java.util.HashMap;
import java.util.Map;

public class ComputadoraFactory {
    private static Map<String, Computadora> computadoraMap;

    public ComputadoraFactory() {
        computadoraMap = new HashMap<>();
    }

    public Computadora getComputadora(Integer ram, Integer discoDuro) {
        // No tengo clave, creo una
        String clave = "key:" + ram + ":" + discoDuro;
        if (!computadoraMap.containsKey(clave)) {
            // No existe la clave --> instanciar un nuevo objeto
            computadoraMap.put(clave, new Computadora(ram, discoDuro, clave));
        }
        return computadoraMap.get(clave);
    }
}
