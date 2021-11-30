package com.example.jpql.repositories;

import com.example.jpql.model.Usuario;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario,Long>{
    
    public Usuario findByDni(String dni);
}
