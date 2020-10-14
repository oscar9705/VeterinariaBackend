package com.practica.proyecto.repository;

import com.practica.proyecto.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(nativeQuery = true,
            value = "UPDATE usuarios " +
                    "SET estado_cliente=false " +
                    "WHERE valor_documento_cliente=:documento")
    int disableUser(@Param(value = "documento") String documento);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(nativeQuery = true,
            value = "UPDATE usuarios " +
                    "SET estado_cliente=true  " +
                    "WHERE valor_documento_cliente=:documento " +
                    "AND (rol='VET' OR rol= 'AUX')")
    int cambiarEstadoColaborador(@Param(value = "documento") String documento);

    @Query(nativeQuery = true,
            value = "SELECT " +
                    "id_cliente, " +
                    "nombres_cliente, " +
                    "apellidos_cliente, " +
                    "tipo_documento_cliente, " +
                    "valor_documento_cliente, " +
                    "fecha_nacimiento_cliente, " +
                    "departamento_residencia_cliente, " +
                    "ciudad_residencia_cliente, " +
                    "barrio_residencia_cliente, " +
                    "telefono_cliente, " +
                    "correo_cliente, " +
                    "contrasenia_cliente, " +
                    "estado_cliente, " +
                    "rol " +
                    "FROM usuarios " +
                    "WHERE estado_cliente=true")
    List<Usuario> findAllUsersActives();

}
