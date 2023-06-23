package com.example.clase38.repository;

import com.example.clase38.entities.Estado;
import com.example.clase38.entities.Partido;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

// NUEVO: extends MongoRepository<Partido,Long>
public interface PartidoRepository extends MongoRepository<Partido, Long> {
        List<Partido> findByEstado(Estado estado);
}
