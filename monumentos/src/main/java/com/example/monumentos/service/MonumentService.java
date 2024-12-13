package com.example.monumentos.service;

import com.example.monumentos.MonumentRepository;
import com.example.monumentos.model.Monument;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MonumentService {
    private final MonumentRepository monumentRepository;

    public List<Monument> query(double maxPrice, String sortDirection){
        List<Monument> result = monumentRepository.query(maxPrice, );
    }
}
