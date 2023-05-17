package com.company;

//Clase que representa una computadora
public class Computadora {
    private int ram;
    private int discoDuro;
    private String id;
    private int contador;

    public Computadora(int ram, int discoDuro, String id) {
        this.ram = ram;
        this.discoDuro = discoDuro;
        this.id = id;
    }

    //Las computadoras representan objetos inmutables, solo tiene métodos de acceso (getters)
    public int getRam() {

        return ram;
    }

    public int getDiscoDuro() {

        return discoDuro;
    }

    public String getId() {

        return id;
    }

    public int getContador() {

        return contador;
    }

    public void incrementarContador() {

        contador++;
    }
}

/*
Flyweight y la inmutabilidad
Debido a que el mismo objeto flyweight puede utilizarse en distintos contextos, debes asegurarte de que su estado
no se pueda modificar. Un objeto flyweight debe inicializar su estado una sola vez a través de parámetros del constructor.
No debe exponer ningún método set (modificador) o campo público a otros objetos.
 */
