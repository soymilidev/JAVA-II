package com.example.paciente.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PacienteController {
    @GetMapping("/index")
    //Model model nos va a permitir cargar informacion
    public String welcome(Model model) {
        model.addAttribute("nombre", "diez");
        //retorna el nombre del tempalte, que esta en resource
        return "index";
    }
}

//Vemos cómo el método welcome tiene el Model por parámetro. Esta es la manera quetenemos de mandar datos del controlador a la vista.
//En la última línea, return “index” va a hacer mención a la plantilla HTML.