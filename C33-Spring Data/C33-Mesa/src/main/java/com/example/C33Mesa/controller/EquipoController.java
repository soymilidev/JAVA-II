package com.example.C33Mesa.controller;

import com.example.C33Mesa.entities.Equipo;
import com.example.C33Mesa.service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipos")
public class EquipoController {
    private EquipoService equipoService;

    @Autowired
    public EquipoController(EquipoService equipoService) {

        this.equipoService = equipoService;
    }

    @PostMapping
    public ResponseEntity<Equipo> registrarEquipo(@RequestBody Equipo equipo) {
        return ResponseEntity.ok(equipoService.guardarEquipo(equipo));
    }

    @GetMapping
    public ResponseEntity<List<Equipo>> listarEquipos() {
        return ResponseEntity.ok(equipoService.listarAllEquipos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarEquipo(@PathVariable Long id) {
        equipoService.borrarEquipo(id);
        return ResponseEntity.ok("Se eliminó al equipo con id=" + id);
    }
}
