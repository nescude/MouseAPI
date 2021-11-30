package com.example.jpql.services;

import com.example.jpql.model.Usuario;
import com.example.jpql.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    
    @Autowired
    UsuarioRepository repo;

    public Usuario save(Usuario usuario){
        return repo.save(usuario);
    }

    public Usuario findUsuario(String dni){
        return repo.findByDni(dni);
    }

    public Iterable<Usuario> findAll() {
        return repo.findAll();
    }
}
