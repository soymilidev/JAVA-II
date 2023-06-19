package com.example.C34Mesa.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "veterinarias")
@Getter
@Setter
public class Veterinaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int costo;

    @OneToMany(mappedBy = "veterinaria", fetch = FetchType.LAZY)
    private Set<Mascota> mascotas = new HashSet<>();

    // Constructor, getters y setters
}
