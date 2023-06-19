package com.example.C34Mesa.service;


import com.example.C34Mesa.entities.Mascota;
import com.example.C34Mesa.entities.Veterinaria;
import com.example.C34Mesa.repository.VeterinariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;


@Service
public class VeterinariaService {
    @Autowired
    private VeterinariaRepository veterinariaRepository;

    public Veterinaria crearVeterinaria(Veterinaria veterinaria) {
        return veterinariaRepository.save(veterinaria);
    }

    public void agregarMascota(Veterinaria veterinaria, Mascota mascota) {
        mascota.setVeterinaria(veterinaria);
        veterinaria.getMascotas().add(mascota);
        veterinariaRepository.save(veterinaria);
    }

    public List<Mascota> consultarMascotasDeVeterinaria(Veterinaria veterinaria) {
        return veterinariaRepository.consultarMascotasDeVeterinaria(veterinaria);
    }

    public List<Mascota> consultarMascotasPerro() {
        return veterinariaRepository.findByTipo("perro");
    }

    public Veterinaria obtenerVeterinariaPorId(Long id) {
        return veterinariaRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("No se encontró la veterinaria con el ID: " + id));
    }
}

