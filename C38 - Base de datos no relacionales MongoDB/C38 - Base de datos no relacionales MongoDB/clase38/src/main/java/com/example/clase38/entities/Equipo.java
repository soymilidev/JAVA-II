package com.example.clase38.entities;

import java.io.Serializable;

// La clase Equipo puede ser serializada; se puede convertir en una secuencia de bytes y posteriormente deserializada,
// es decir, se puede reconstruir el objeto a partir de esa secuencia de bytes.
// ¡Me interesan los partidos, no los equipos!
public class Equipo implements Serializable {
    private Long id;
    private String nombre;
    private String pais;

    public Equipo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
