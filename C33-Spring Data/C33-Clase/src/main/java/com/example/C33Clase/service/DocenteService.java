package com.example.C33Clase.service;

import com.example.C33Clase.entities.Docente;
import com.example.C33Clase.repository.DocenteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteService {
    private DocenteRepository docenteRepository;

    public DocenteService(DocenteRepository docenteRepository) {
        this.docenteRepository = docenteRepository;
    }
    public Docente guardarDocente(Docente docente){
        return docenteRepository.save(docente);
    }
    public List<Docente> listarAllDocentes(){
        return docenteRepository.findAll();
    }
    public void borrarDocente(Long id){
        docenteRepository.deleteById(id);
    }
}
