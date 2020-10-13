package com.ejemplo.demo.repository;

import com.ejemplo.demo.model.Veterinarias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface VeterinariasRepository extends JpaRepository<Veterinarias,Long> {

    @Query(nativeQuery = true,
            value = "UPDATE veterinarias " +
                    "SET estado_veterinaria=false " +
                    "WHERE nit_veterinaria=:nit")
    Veterinarias disableVeterinary(@Param(value = "nit") String nit);

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
    List<Veterinarias> findAllVeterinariansActives();
}
