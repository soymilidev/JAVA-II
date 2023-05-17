package com.company;

import java.util.HashMap;
import java.util.Map;

//Clase que actúa como el contenedor de computadoras
public class ComputadoraFactory {
    //Declaro una variable "computadoras"
    //Map representa una colección de pares clave(key)-valor(value).
    //Accedemos a los valores a través de las claves.

    private Map<String, Computadora> computadoras;

    public ComputadoraFactory() {
        //En el HashMap, las etiquetas se llaman "claves" y los objetos que guardamos se llaman "valores".
        //Cada clave tiene un valor asociado. Por ejemplo, si hay una clave llamada "alfombra" y se le asigna el valor "verde",
        //el HashMap recordará que cuando busques la clave "alfombra", obtendrás el valor "verde".

        //En esta parte específica del código, se está inicializando el map de computadoras (computadoras) en el constructor
        //utilizando la clase HashMap. Esto significa que cuando se crea una instancia de la clase ComputadoraFactory,
        //se crea también un nuevo objeto HashMap y se asigna a la variable computadoras.
                computadoras = new HashMap<>();
    }

    public Computadora getComputer(String type) {
        //Obtener la computadora del map según el tipo
        Computadora computadora = computadoras.get(type);

        if (computadora == null) {
            switch (type) {
                case "Windows":
                    computadora = new Computadora(2, 128, "Windows");
                    break;
                case "Mac":
                    computadora = new Computadora(16, 500, "Mac");
                    break;
                default:
                    throw new IllegalArgumentException("Tipo de computadora no válido");
            }

            //Agregar la computadora al map utilizando el tipo como clave
            computadoras.put(type, computadora);
        }

        computadora.incrementarContador();
        return computadora;
    }

    public int getTotalComputadoras() {
        return computadoras.size();
    }
}
