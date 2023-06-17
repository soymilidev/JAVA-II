package com.example.C33Mesa.service;

import com.example.C33Mesa.entities.Equipo;
import com.example.C33Mesa.repository.EquipoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoService {
    private EquipoRepository equipoRepository;

    public EquipoService(EquipoRepository docenteRepository) {
        this.equipoRepository = docenteRepository;
    }

    public Equipo guardarEquipo(Equipo docente) {
        return equipoRepository.save(docente);
    }

    public List<Equipo> listarAllEquipos() {
        return equipoRepository.findAll();
    }

    public void borrarEquipo(Long id) {
        equipoRepository.deleteById(id);
    }
}
