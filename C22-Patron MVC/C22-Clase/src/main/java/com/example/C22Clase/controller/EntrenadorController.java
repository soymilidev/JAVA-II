package com.example.C22Clase.controller;

import com.example.C22Clase.model.Entrenador;
import com.example.C22Clase.service.EntrenadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller en el caso de que este usando la vista
@RestController
//Mapea todas las solicitudes que vienen con un endpoint: x
@RequestMapping("/entrenador")
public class EntrenadorController {
    //relacion de asociacion
    private EntrenadorService entrenadorService;

    //constructor
    //@Autowired ---> Inyección de dependencias en constructores.
    //conexión entre el modelo y el controlle
    @Autowired
    public EntrenadorController(EntrenadorService entrenadorService) {
        this.entrenadorService = entrenadorService;
    }

    @GetMapping
    public List<Entrenador> obtenerLista() {
        return entrenadorService.obtenerEntrenadores();
    }
}