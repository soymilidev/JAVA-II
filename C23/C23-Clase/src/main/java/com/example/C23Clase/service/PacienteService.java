package com.example.C23Clase.service;

import com.example.C23Clase.dao.IDao;
import com.example.C23Clase.model.Paciente;
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
}