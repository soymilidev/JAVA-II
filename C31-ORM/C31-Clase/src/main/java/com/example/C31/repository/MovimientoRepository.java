package com.example.C31.repository;

import com.example.C31.model.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;

//<T , ID> T = entidad, Id = Tipo
public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {
}
