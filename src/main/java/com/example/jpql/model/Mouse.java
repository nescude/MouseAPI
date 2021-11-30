package com.example.jpql.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@Document(collection = "mouses")
public class Mouse implements Serializable{

    private static final long serialVersionUID = 000000000001L;

    @Id
    private String ucode;
    private String descripcion;
    private String marca, color;
    private String idPropietario;

}
