package com.example.clase38.controller;

import com.example.clase38.entities.Partido;
import com.example.clase38.service.PartidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partidos")
public class PartidoController {
    private PartidoService partidoService;

    public PartidoController(PartidoService partidoService) {
        this.partidoService = partidoService;
    }

    @PostMapping
    public ResponseEntity<Partido> agregarPartido(@RequestBody Partido partido) {
        return ResponseEntity.ok(partidoService.agregar(partido));
    }

    @GetMapping("/listar-todos")
    public ResponseEntity<List<Partido>> listarPartidos() {
        List<Partido> partidos = partidoService.listarPartidos();
        return ResponseEntity.ok(partidos);
    }

    @GetMapping("/envivo")
    public ResponseEntity<List<Partido>> listarPartidosEnVivo() {
        List<Partido> partidosEnVivo = partidoService.listarPartidosEnVivo();
        return ResponseEntity.ok(partidosEnVivo);
    }
}
