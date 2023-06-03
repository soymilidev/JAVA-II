package com.example.C23Clase.controller;

import com.example.C23Clase.model.Paciente;
import com.example.C23Clase.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/pacientes")
public class PacienteController {
    private PacienteService pacienteService;

    //constructor
    //@Autowired ---> inyectar dependencia(realcion de depencia), que spring coloque un objeto para realizar una operacion
    @Autowired
    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping
    //devuelve el nombre de la plantilla, un String
    //precisa info externa correo ---> solicitud de parametro. Tipo + nombre del parametro: String email
    public String buscarPacientePorCorreo(Model model, @RequestParam("email") String email) {
        //búsqueda del paciente
        Paciente paciente = pacienteService.buscarPacienteXEmail(email);
        model.addAttribute("nombre", paciente.getNombre());
        model.addAttribute("apellido", paciente.getApellido());
        return "index";
    }
}