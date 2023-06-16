package com.example.C33Clase.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "docentes")
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nombre;
    @Column
    private String titulo;
    // *Profesor*-------Estudiante
    // Precisamos una lista de estudiantes
    // docentes = el atributo del otro lado de la relacion
    @OneToMany(mappedBy = "docente", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    // puede ser un List -- new ArrayList
    @JsonIgnore
    // evitar un bucle infinito
    private Set<Estudiante> estudiantes = new HashSet<>();

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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Set<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Set<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
