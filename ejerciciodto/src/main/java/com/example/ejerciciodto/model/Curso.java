package com.example.ejerciciodto.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data

public class Curso{
    public Long id;
    public String nombre;
    public String tipo;
    public String tutor;
    public int aula;

    public Curso(Long id, String nombre, String tipo, String tutor, int aula) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.tutor = tutor;
        this.aula = aula;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", tutor='" + tutor + '\'' +
                ", aula=" + aula +
                '}';
    }
}