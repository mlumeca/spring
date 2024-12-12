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
//    @GetMapping
//    public ResponseEntity<List<Product>> getAll() {
//        // Obtener la lista de productos del repositorio
//        List<Product> result = productRepository.getAll();
//
//        // Si la lista está vacía devuelve 404
//        if (result.isEmpty()) {
//            return ResponseEntity.notFound().build();
//        }
//        // Si la lista tiene productos devolvemos 200 con la lista
//        return ResponseEntity.ok(result);
//    }

    @GetMapping
    public ResponseEntity<List<Product>> getAll(
            @RequestParam(required = false,
            value = "maxPrice", defaultValue = "-1") double max,
            @RequestParam(required = false,
            value = "sort", defaultValue = "no") String sortDirection
    ) {

        List<Product> result = productRepository.query(max, sortDirection);

        if (result.isEmpty())
            return ResponseEntity.notFound().build();

    }

    @PostMapping
    public ResponseEntity<Product> create(
            @RequestBody Product product) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(productRepository.add(product));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable Long id) {
        return ResponseEntity.of(  //of acepta un valor de retorno?
                productRepository.get(id)
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@PathVariable Long id, @RequestBody Product product) {
        return ResponseEntity.of(
                productRepository.edit(id, product)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> delete(@PathVariable Long id) {
        productRepository.delete(id);
        return ResponseEntity.noContent().build(); // también se puede con un .status
        // metodo ok, of (acepta un optional) y build son terminales, mientras que nocontent, status, notfound es intermedio
        // patrón de diseño builder, objetos que ayudan a construir otros objetos
    }
}
