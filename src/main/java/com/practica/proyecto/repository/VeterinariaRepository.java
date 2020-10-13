package com.practica.proyecto.repository;

import com.practica.proyecto.model.Veterinaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface VeterinariaRepository extends JpaRepository<Veterinaria, Long> {

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(nativeQuery = true,
            value = "UPDATE veterinarias " +
                    "SET estado_veterinaria=false " +
                    "WHERE nit_veterinaria=:nit")
    int disableVeterinary(@Param(value = "nit") String nit);

    @Query(nativeQuery = true,
            value = "SELECT " +
                    "id_veterinaria, " +
                    "nombre_veterinaria, " +
                    "nit_veterinaria, " +
                    "correo_veterinaria, " +
                    "estado_veterinaria, " +
                    "fk_duenio_veterinaria " +
                    "FROM veterinarias " +
                    "WHERE estado_veterinaria=true")
    List<Veterinaria> findAllVeterinariansActives();
}
