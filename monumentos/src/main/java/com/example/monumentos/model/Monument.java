package com.example.monumentos.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Monument {
    private Long id;
    private String isoCode;
    private String countryName;
    private String cityName;
    private Double latitude;
    private Double longitude;
    private String name;
    private String description;
    private String imgPath;
}