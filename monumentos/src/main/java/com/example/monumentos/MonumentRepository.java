package com.example.monumentos;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class MonumentRepository {
    private HashMap<Long, Monument> monuments = new HashMap<>();

    @PostConstruct
    public void init() {
        add(Monument.builder()
                .id(1L)
                .isoCode("ES")
                .countryName("España")
                .cityName("Sevilla")
                .latitude(37.38614)
                .longitude(-5.99238)
                .name("Giralda")
                .description("Una torre muy alta con un señor que aguanta una veleta arriba.")
                .imgPath("https://upload.wikimedia.org/wikipedia/commons/thumb/9/93/La_Giralda_August_2012_Seville_Spain.jpg/240px-La_Giralda_August_2012_Seville_Spain.jpg")
                .build());

        add(Monument.builder()
                .id(2L)
                .isoCode("ES")
                .countryName("España")
                .cityName("Barcelona")
                .latitude(41.40369)
                .longitude(2.17433)
                .name("Sagrada Familia")
                .description("Un edificio perteneciente a una familia muy cercana a los dioses.")
                .imgPath("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Sagrada_Familia_1-4-24.jpg/800px-Sagrada_Familia_1-4-24.jpg")
                .build());

        add(Monument.builder()
                .id(3L)
                .isoCode("USA")
                .countryName("Estados Unidos")
                .cityName("Pennington County")
                .latitude(43.878889)
                .longitude(-103.459722)
                .name("Monte Rushmore")
                .description("Tienen la cara muy dura.")
                .imgPath("https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Mount_Rushmore.jpg/800px-Mount_Rushmore.jpg")
                .build());
    }

    public Monument add(Monument monument) {
        monuments.put(monument.getId(), monument);
        return monument;
    }

    public Optional<Monument> get(Long id) {
        return Optional.ofNullable(monuments.get(id));
    }

    public List<Monument> getAll() {
        return List.copyOf(monuments.values());
    }

    public void delete(Long id) {
        monuments.remove(id);
    }
}
