package com.example.C34Mesa.controller;

import com.example.C34Mesa.entities.Mascota;
import com.example.C34Mesa.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mascotas")
public class MascotaController {
    @Autowired
    private MascotaService mascotaService;

    @PostMapping
    public ResponseEntity<Mascota> guardarMascota(@RequestBody Mascota mascota) {
        Mascota nuevaMascota = mascotaService.guardarMascota(mascota);
        return ResponseEntity.ok(nuevaMascota);
    }

    @GetMapping("/perros")
    public ResponseEntity<List<Mascota>> obtenerMascotasPerro() {
        List<Mascota> mascotasPerro = mascotaService.consultarMascotasPerro();
        return ResponseEntity.ok(mascotasPerro);
    }
}
