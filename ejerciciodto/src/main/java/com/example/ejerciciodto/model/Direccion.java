package com.example.ejerciciodto.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Direccion {
    private Long id;
    private String tipoVia;
    private String linea1;
    private String linea2;
    private Long cp;
    private String poblacion;
    private String provincia;
}