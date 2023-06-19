package com.example.C34Mesa.service;

import com.example.C34Mesa.entities.Mascota;
import com.example.C34Mesa.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService {
    @Autowired
    private MascotaRepository mascotaRepository;

    public Mascota guardarMascota(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }

    public List<Mascota> consultarMascotasPerro() {
        return mascotaRepository.findByTipo("perro");
    }
}