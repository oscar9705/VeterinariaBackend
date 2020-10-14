package com.practica.proyecto.repository;

import com.practica.proyecto.model.Mascota;
import com.practica.proyecto.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Long> {

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(nativeQuery = true,
            value = "UPDATE mascota " +
                    "SET estado_mascota=false " +
                    "WHERE nombre_mascota=:nombre_mascota")
    int disableMascota(@Param(value = "nombre_mascota") String nombre_mascota);

}
