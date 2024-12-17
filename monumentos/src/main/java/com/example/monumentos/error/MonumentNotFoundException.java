package com.example.monumentos.error;

public class MonumentNotFoundException extends RuntimeException{
    public MonumentNotFoundException(Long id) {
        super("No hay producto con ese ID: %d".formatted(id));
    }

    public MonumentNotFoundException(String msg) {
        super(msg);
    }

    public MonumentNotFoundException() {
        super("No hay monumentos con esos requisitos de búsqueda");
    }
}