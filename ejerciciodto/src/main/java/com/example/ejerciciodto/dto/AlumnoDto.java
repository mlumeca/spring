package com.example.ejerciciodto.dto;

import com.example.ejerciciodto.model.Curso;
import com.example.ejerciciodto.model.Direccion;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor


public class AlumnoDto{
        public String nombre;
        public String apellidos;
        public String email;
        public Curso curso;
        public Direccion direccion;

    public AlumnoDto (String nombre,
                      String apellido1,
                      String apellido2,
                      String email,
                      Curso curso,
                      Direccion direccion) {
        this.nombre = nombre;
        this.apellidos = apellido1 + " " + apellido2;
        this.email = email;
        this.curso = curso;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "AlumnoDto{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", curso=" + curso +
                ", direccion=" + direccion +
                '}';
    }
}
