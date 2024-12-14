package com.example.ejerciciodto.model;

import lombok.Data;

import java.util.List;

@Data

public class Producto {
    public Long id;
    public String nombre;
    public String desc;
    public Double pvp;
    public List<String> imagenes;
    public Categoria categoria;

    public Producto(Long id, String nombre, String desc, Double pvp, List<String> imagenes, Categoria categoria) {
        this.id = id;
        this.nombre = nombre;
        this.desc = desc;
        this.pvp = pvp;
        this.imagenes = imagenes;
        this.categoria = categoria;
    }
}