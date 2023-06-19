package com.example.C34Mesa.controller;

import com.example.C34Mesa.entities.Mascota;
import com.example.C34Mesa.entities.Veterinaria;
import com.example.C34Mesa.service.VeterinariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veterinarias")
public class VeterinariaController {
    @Autowired
    private VeterinariaService veterinariaService;

    @PostMapping
    public ResponseEntity<Veterinaria> crearVeterinaria(@RequestBody Veterinaria veterinaria) {
        Veterinaria nuevaVeterinaria = veterinariaService.crearVeterinaria(veterinaria);
        return ResponseEntity.ok(nuevaVeterinaria);
    }

    @PostMapping("/{id}/mascotas")
    public ResponseEntity<Veterinaria> agregarMascota(@PathVariable Long id, @RequestBody Mascota mascota) {
        Veterinaria veterinaria = veterinariaService.obtenerVeterinariaPorId(id);
        veterinariaService.agregarMascota(veterinaria, mascota);
        return ResponseEntity.ok(veterinaria);
    }

    @GetMapping("/{id}/mascotas")
    public ResponseEntity<List<Mascota>> consultarMascotasDeVeterinaria(@PathVariable Long id) {
        Veterinaria veterinaria = veterinariaService.obtenerVeterinariaPorId(id);
        List<Mascota> mascotas = veterinariaService.consultarMascotasDeVeterinaria(veterinaria);
        return ResponseEntity.ok(mascotas);
    }

    @GetMapping("/mascotas/perros")
    public ResponseEntity<List<Mascota>> consultarMascotasPerro() {
        List<Mascota> mascotasPerro = veterinariaService.consultarMascotasPerro();
        return ResponseEntity.ok(mascotasPerro);
    }
}
