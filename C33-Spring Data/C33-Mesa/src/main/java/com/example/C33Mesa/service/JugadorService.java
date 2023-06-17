package com.example.C33Mesa.service;

import com.example.C33Mesa.entities.Jugador;
import com.example.C33Mesa.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JugadorService {
    private JugadorRepository jugadorRepository;

    @Autowired
    public JugadorService(JugadorRepository jugadorRepository) {
        this.jugadorRepository = jugadorRepository;
    }

    public Jugador guardarJugador(Jugador jugador) {
        return jugadorRepository.save(jugador);
    }
}
