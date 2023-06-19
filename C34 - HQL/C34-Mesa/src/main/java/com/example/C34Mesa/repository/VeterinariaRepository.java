package com.example.C34Mesa.repository;


import com.example.C34Mesa.entities.Mascota;
import com.example.C34Mesa.entities.Veterinaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VeterinariaRepository extends JpaRepository<Veterinaria, Long> {
    // Método para crear una nueva Veterinaria
    // No es necesario implementarlo aquí, se hereda de JpaRepository

    // Método para agregar mascotas a la Veterinaria
    // No es necesario implementarlo aquí, se maneja a través de la asociación en las entidades

    // Método para consultar todas las mascotas de una Veterinaria
    @Query("SELECT m FROM Mascota m WHERE m.veterinaria = :veterinaria")
    List<Mascota> consultarMascotasDeVeterinaria(@Param("veterinaria") Veterinaria veterinaria);

    // Método para consultar todas las mascotas que son perro
    List<Mascota> findByTipo(String tipo);
}
