package com.example.ejerciciodto.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Producto {
    private Long id;
    private String nombre;
    private String desc;
    private Double pvp;
    private List<String> imagenes;
    private String categoria;
}
