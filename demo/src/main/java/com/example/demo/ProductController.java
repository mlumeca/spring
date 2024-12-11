package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product") //para poner un prefijo común
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;

    //primer metodo de controlador
    @GetMapping
    public ResponseEntity<List<Product>> getAll() {
        // Obtener la lista de productos del repositorio
        List<Product> result = productRepository.getAll();

        // Si la lista está vacía devuelve 404
        if (result.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        // Si la lista tiene productos devolvemos 200 con la lista
        return ResponseEntity.ok(result);
    }

    @PostMapping
    public ResponseEntity<Product> create(
            @RequestBody Product product) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(productRepository.add(product));
    }
}
