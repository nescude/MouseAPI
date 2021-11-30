package com.example.jpql.services;

import com.example.jpql.model.Mouse;
import com.example.jpql.repositories.MouseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MouseService {
    
    @Autowired
    MouseRepository repo;

    public Mouse save(Mouse mouse){
        return repo.save(mouse);
    }

    public Mouse findMouse(String ucode){
        return repo.findByUcode(ucode);
    }

    public Iterable<Mouse> findAll() {
        return repo.findAll();
    }
}