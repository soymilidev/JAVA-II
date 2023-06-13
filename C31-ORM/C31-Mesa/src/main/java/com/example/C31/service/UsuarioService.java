package com.example.C31.service;

import com.example.C31.model.Usuario;
import com.example.C31.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    //@Transactional: significa que todas las operaciones deben completarse exitosamente o ninguna de ellas debe ser persistida en la base de datos
    //si ocurre alguna excepción durante la ejecución de esas operaciones, se realiza un rollback
    @Transactional
    public Usuario registrarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    @Transactional
    public List<Usuario> listarTodosLosUsuarios() {
        return usuarioRepository.findAll();
    }
}
