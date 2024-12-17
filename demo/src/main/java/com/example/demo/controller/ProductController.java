package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.model.ProductRepository;
import com.example.demo.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/product/")
@RequiredArgsConstructor
@Tag(name = "Producto", description = "el controlador de producto")
public class ProductController {
    @Operation(summary = "Obtiene todos los productos")
    @ApiResponse(value = {
            @ApiResponse(responseCode = "200",
                    description = "Se han encontrado productos",
                    content = {Content(mediaType = "application/json",
                            array =@ArraySchema(schema = @Schema(implementation = GetProductListDto.class)),
                            examples={@ExampleObject(
                                value = """
                                        [
                                            {"id": 1, "name": "Laptop", "price": 1234.56},
                                            {"id": 2, "name": "Smartphone", "price": 999.99},
                                        ]
                                        """
                            )}
                    )}),
    @ApiResponse(responseCode = "404",
            description = "No se ha encontrado ningún producto",
            content = @Content),
})

    private final ProductService productService;

    @GetMapping
    public List<Product> getAll(
            @RequestParam(required = false, value = "maxPrice", defaultValue = "-1") double max,
            @RequestParam(required = false, value = "sort", defaultValue = "no") String sortDirection
    ) {
        return productService.query(max, sortDirection);
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return productService.get(id);
    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product product) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(productService.add(product));
    }

    @PutMapping("/{id}")
    public Product edit(
            @RequestBody Product product,
            @PathVariable("id") Long productId) {

        return productService.edit(productId, product);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        productService.delete(id);
        return ResponseEntity.noContent().build();
    }


}
