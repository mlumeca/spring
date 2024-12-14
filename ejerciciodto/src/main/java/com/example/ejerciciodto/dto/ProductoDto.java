package com.example.ejerciciodto.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class ProductoDto{
        public String nombre;
        public Double pvp;
        public String imagen;
        public String categoria;

        public ProductoDto(String nombre, Double pvp, String imagen, String categoria) {
                this.nombre = nombre;
                this.pvp = pvp;
                this.imagen = imagen;
                this.categoria = categoria;
        }

        @Override
        public String toString() {
                return "ProductoDto{" +
                        "nombre='" + nombre + '\'' +
                        ", pvp=" + pvp +
                        ", imagen='" + imagen + '\'' +
                        ", categoria='" + categoria + '\'' +
                        '}';
        }
}