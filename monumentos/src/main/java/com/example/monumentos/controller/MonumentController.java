package com.example.monumentos.controller;

import com.example.monumentos.model.Monument;
import com.example.monumentos.model.MonumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monument/")
@RequiredArgsConstructor

public class MonumentController {
    private final MonumentRepository monumentRepository;

    @GetMapping
    public ResponseEntity<List<Monument>> getAll() {
        List<Monument> result = monumentRepository.getAll();

        if (result.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(result);
    }

    @PostMapping
    public ResponseEntity<Monument> create(
            @RequestBody Monument monument) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(monumentRepository.add(monument));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Monument> getById(@PathVariable Long id) {
        return ResponseEntity.of(
                monumentRepository.get(id)
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<Monument> edit(
            @RequestBody Monument monument,
            @PathVariable("id") Long monumentId) {

        return ResponseEntity.of(monumentRepository.edit(monumentId, monument));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        monumentRepository.delete(id);
        return ResponseEntity.noContent().build();
    }
}