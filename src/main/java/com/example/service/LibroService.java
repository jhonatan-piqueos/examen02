package com.example.service;

import java.util.List;

import com.example.entity.Libro;

public interface LibroService {

	List<Libro> readAll();

	Libro create(Libro al);

	Libro read(int id);

	void delete(int id);

	Libro update(Libro al);
	
	
}
