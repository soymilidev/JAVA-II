package com.example.C31.controller;

import com.example.C31.model.Movimiento;
import com.example.C31.service.MovimientoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimientos")
public class MovimientoController {
    private MovimientoService movimientoService;

    public MovimientoController(MovimientoService movimientoService) {

        this.movimientoService = movimientoService;
    }

    @PostMapping
    public ResponseEntity<Movimiento> registrarMovimiento(@RequestBody Movimiento movimiento) {
        return ResponseEntity.ok(movimientoService.registrarMovimiento(movimiento));
    }

    @GetMapping
    public ResponseEntity<List<Movimiento>> buscarMovimientos() {
        return ResponseEntity.ok(movimientoService.listarTodosLosMovimientos());
    }
}
