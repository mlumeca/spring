package com.example.ejerciciodto.model;

import lombok.Data;

@Data

public class Categoria{
    public Long id;
    String nombre;

    public Categoria(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}