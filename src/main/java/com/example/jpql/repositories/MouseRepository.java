package com.example.jpql.repositories;

import java.util.Optional;

import com.example.jpql.model.Mouse;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MouseRepository extends MongoRepository<Mouse, Long> {
    
    public Optional<Mouse> findByMarca(String marca);

    public Mouse findByUcode(String ucode);
}
