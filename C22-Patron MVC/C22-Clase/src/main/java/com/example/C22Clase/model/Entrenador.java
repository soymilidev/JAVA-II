package com.example.C22Clase.model;

//Crear un modelo, es decir, una clase de negocio Entrenador.
public class Entrenador {
    private String nombre;

    public Entrenador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}