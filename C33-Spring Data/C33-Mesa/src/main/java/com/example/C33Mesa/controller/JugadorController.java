package com.example.C33Mesa.controller;

import com.example.C33Mesa.entities.Jugador;
import com.example.C33Mesa.service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jugadores")
public class JugadorController {
    private JugadorService jugadorService;

    @Autowired
    public JugadorController(JugadorService jugadorService) {

        this.jugadorService = jugadorService;
    }

    @PostMapping
    public ResponseEntity<Jugador> registrarJugador(@RequestBody Jugador jugador) {
        return ResponseEntity.ok(jugadorService.guardarJugador(jugador));
    }
}
