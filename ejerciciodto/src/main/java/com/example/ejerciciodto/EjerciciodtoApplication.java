package com.example.ejerciciodto;

import com.example.ejerciciodto.dto.ProductoDto;
import com.example.ejerciciodto.model.*;
import com.example.ejerciciodto.dto.AlumnoDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class EjerciciodtoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjerciciodtoApplication.class, args);

		// APARTADO 1
		// Creación de la dirección
		Direccion direccion = new Direccion(1L, "AAAvenida",
				"de todos los santísimos barcos", "número 8", 8,
				"Coca de la Piñera", "Barbate");

		// Creación del curso
		Curso curso = new Curso(1L, "Clase de triángulo", "difisi",
				"La misma Manolita", 308);

		// Creación del alumno
		Alumno alumno = new Alumno(1L, "Manolita", "Romerota",
				"Analicusa", "+34 888 88 88 88",
				"aaa@aaa.aaa", direccion, curso);

		// Creación del DTO
		AlumnoDto alumnodto = new AlumnoDto(alumno.getNombre(), alumno.getApellido1(),
				alumno.getApellido2(), alumno.getEmail(), alumno.getCurso(), alumno.getDireccion());

		System.out.println(alumnodto);

		// APARTADO 2
		// Creación de un producto
		List<String> imagenes = List.of("imagen1", "imagen2", "imagen3");

		Producto producto = new Producto(1L, "parachute", "espectacular",
				24.99, imagenes, new Categoria(1L, "militar"));

		// Creación de un DTO
		ProductoDto productoDto = new ProductoDto(producto.nombre, producto.pvp,
				producto.imagenes.get(0), producto.categoria.getNombre());

		System.out.println(productoDto);
	}
}
