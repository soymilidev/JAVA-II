package com.example.C25Clase.service;

import com.example.C25Clase.dao.IDao;
import com.example.C25Clase.model.Paciente;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {
    private IDao<Paciente> pacienteIDao;

    public PacienteService(IDao<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    public Paciente buscarPacienteXEmail(String email) {
        return pacienteIDao.buscarXString(email);
    }

    public Paciente guardarPaciente(Paciente paciente) {
        return pacienteIDao.guardar(paciente);
    }
}
