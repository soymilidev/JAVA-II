package org.example;

import java.io.Serializable;

//implementamos la interfaz Serializable para permitir la serialización de objetos.
public class Contacto implements Serializable {
    private String nombre;
    private String apellido;
    private String mail;
    private String teléfono;

    public Contacto(String nombre, String apellido, String mail, String teléfono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.teléfono = teléfono;
    }

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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", mail='" + mail + '\'' +
                ", telefono='" + teléfono + '\'' +
                '}';
    }
}