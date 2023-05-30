package org.example;

import java.io.Serializable;

public class Perro implements Serializable {
    private Integer edad;
    private String nombre;

    public Perro(Integer edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}