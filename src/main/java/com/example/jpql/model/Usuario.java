package com.example.jpql.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Document(collection = "usuarios")
public class Usuario {

    @Id
    private String dni;
    private String user, pass, email;

    protected Usuario(){};
}
