package com.example.ejerciciodto.model;


import lombok.Data;

@Data
public class Direccion {
    public Long id;
    public String tipoVia;
    public String linea1;
    public String linea2;
    public int cp;
    public String poblacion;
    public String provincia;

    public Direccion(Long id, String tipoVia, String linea1, String linea2, int cp, String poblacion, String provincia) {
        this.id = id;
        this.tipoVia = tipoVia;
        this.linea1 = linea1;
        this.linea2 = linea2;
        this.cp = cp;
        this.poblacion = poblacion;
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "id=" + id +
                ", tipoVia='" + tipoVia + '\'' +
                ", linea1='" + linea1 + '\'' +
                ", linea2='" + linea2 + '\'' +
                ", cp=" + cp +
                ", poblacion='" + poblacion + '\'' +
                ", provincia='" + provincia + '\'' +
                '}';
    }
}