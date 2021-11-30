package com.example.jpql.controllers;

import com.example.jpql.model.Usuario;
import com.example.jpql.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    UsuarioService service;

    @PostMapping("/")
    public Usuario addUsuario(@RequestBody Usuario usuario){
        return service.save(usuario);
    }

    @GetMapping("/{dni}")
    public Usuario getUsuario(@PathVariable String dni){
        return service.findUsuario(dni);
    }

    @GetMapping("/all")
    public Iterable<Usuario> findAll(){
       return service.findAll();
    }
}
