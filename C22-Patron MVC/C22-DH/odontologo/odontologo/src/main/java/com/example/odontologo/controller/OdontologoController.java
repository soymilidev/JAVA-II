package com.example.odontologo.controller;

import com.example.odontologo.domain.Odontologo;
import com.example.odontologo.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// @RestController para decirle a Spring que este es nuestro controller
// @RequestMapping para agregar nuestra URL, en este caso/odontólogo.
//La annotation @Autowired se trata de la conexión entre el modelo y el controller.

@RestController
@RequestMapping("odontologos")
public class OdontologoController {
    private final OdontologoService odontologoService;

    @Autowired
    public OdontologoController(OdontologoService odontologoService) {
        this.odontologoService = odontologoService;
    }

    @GetMapping
    public List<Odontologo> getOdontologos() {
        return odontologoService.listaOdontologos();
    }
}

//Como podés observar, la clase controller hace referencia a service (el modelo) y
//después, automáticamente lo transforma en Json, que sería nuestra vista. Esto
//pasa dentro de @GetMapping annotation.