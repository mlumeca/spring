package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
// Modelo de datos

@Data
//anotacion de lombok que genera getter y setter para todos los atributos, con la anotacion
// camelCase, metodos equal y hashcode? y toString, add constructores necesarios, un constructor
// sin argumentos, un constructor con todos  es derivada de varias
@NoArgsConstructor
@AllArgsConstructor
@Builder //construir producto ...

public class Product {

    private Long id;
    private String name;
    private double price;

}
