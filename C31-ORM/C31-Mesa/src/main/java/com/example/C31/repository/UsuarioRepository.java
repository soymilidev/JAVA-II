package com.example.C31.repository;

import com.example.C31.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

//<T , ID> T = entidad, Id = Tipo
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
