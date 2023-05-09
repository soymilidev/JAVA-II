package com.company;

public class Persona {
    // 1 - Atributos
    private String nombre;
    private String apellido;
    private String email;
    private int edad;

    // 2 - Constructor
    public Persona(String nombre, String apellido, String email, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.edad = edad;
    }

    // 3 - Getter y setter para los atributos

    // 4 - Métodos
    public String getApellidoNombre() {
        return apellido + ", " + nombre;
    }

    public boolean esMayorDe18() {
        return edad >= 18;
    }
}