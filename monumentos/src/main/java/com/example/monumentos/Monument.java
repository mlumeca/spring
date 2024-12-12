package com.example.monumentos;

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
    private String code;
    private String countryName;
    private String cityName;
    // localizacion - latitud
    // localizacion - longitud
    private String name;
    private String description;
    private String imgPath;

}