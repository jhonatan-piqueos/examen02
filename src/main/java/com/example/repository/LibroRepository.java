package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer>{

}
