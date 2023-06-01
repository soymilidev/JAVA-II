package com.example.C22Clase.service;

import com.example.C22Clase.model.Entrenador;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

//Indicamos que es una clase de servicio
@Service
public class EntrenadorServiceImpl implements EntrenadorService {
    @Override
    public List<Entrenador> obtenerEntrenadores() {
        //Los valores vendrian de una BdD, mediante DAO
        //asList pasa la lista como un array
        //El metodo se comunca con el controller
        return Arrays.asList(new Entrenador("Agustina"), new Entrenador("Juan"), new Entrenador("Manuel"));
    }
}