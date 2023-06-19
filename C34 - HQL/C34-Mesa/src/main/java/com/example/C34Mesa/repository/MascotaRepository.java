package com.example.C34Mesa.repository;


import com.example.C34Mesa.entities.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Long> {
    // No es necesario agregar un método para crear una nueva Mascota,
    // se crea automáticamente al guardarla en la asociación con la Veterinaria

    // No es necesario agregar un método para agregar una Mascota a la Veterinaria,
    // se maneja a través de la asociación en las entidades

    // No es necesario agregar un método para consultar todas las mascotas de una Veterinaria,
    // se puede hacer a través de la asociación en las entidades

    // Método para consultar todas las mascotas que son perro
    List<Mascota> findByTipo(String tipo);
}
