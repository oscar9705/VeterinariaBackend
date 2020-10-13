package com.practica.proyecto.repository;

import com.practica.proyecto.model.Veterinaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeterinariaRepository extends JpaRepository<Veterinaria, Long> {
}