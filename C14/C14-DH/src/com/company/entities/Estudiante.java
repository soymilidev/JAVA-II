package com.company.entities;

public class Estudiante {
    private String nombre;
    private String apellido;
    private Long id;
    //siempre vamos a ponerles a nuestras entidades un id, es conveniente que sea una Long.

    /*
    public Estudiante(String nombre, String apellido, Long id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }

    public Estudiante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Estudiante() {
    }
    */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
