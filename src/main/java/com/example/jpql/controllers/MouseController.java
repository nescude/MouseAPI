package com.example.jpql.controllers;

import com.example.jpql.model.Mouse;
import com.example.jpql.model.Usuario;
import com.example.jpql.services.MouseService;
import com.example.jpql.services.UsuarioService;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mouse")
public class MouseController {

    @Autowired
    MouseService service;

    @Autowired
    UsuarioService usv;

    @PostMapping("/")
    public Mouse addMouse(@RequestBody Mouse mouse){
        return service.save(mouse);
    }

    @GetMapping("/{ucode}")
    public Mouse findMouse(@PathVariable String ucode){
       return service.findMouse(ucode);
    }

    @GetMapping("/all")
    public Iterable<Mouse> findAll(){
       return service.findAll();
    }

    @PostMapping("/{ucode}/{userid}")
    public boolean comprar(@PathVariable String ucode, @PathVariable String userid){
        Mouse m = service.findMouse(ucode);
        Usuario s = usv.findUsuario(userid);
        if (m!= null && m.getIdPropietario() == null && s != null){
            m.setIdPropietario(userid);
            service.save(m);
            return true;
        }
        else
            return false;
    }
    
}
