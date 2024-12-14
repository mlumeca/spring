package com.example.ejerciciodto.model;

import lombok.*;

@Data

public class Alumno{
    public Long id;
    public String nombre;
    public String apellido1;
    public String apellido2;
    public String telefono; // telefono es tipo String por si introducen el formato internacional
    public String email;
    public Direccion direccion;
    public Curso curso;

    public Alumno(Long id, String nombre, String apellido1, String apellido2, String telefono, String email, Direccion direccion, Curso curso) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.curso = curso;
    }
}