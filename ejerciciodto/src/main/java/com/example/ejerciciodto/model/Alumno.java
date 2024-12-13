package com.example.ejerciciodto.model;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Alumno {
    private Long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Long telefono;
    private String email;
    private String direccion;
    private String curso;
}
