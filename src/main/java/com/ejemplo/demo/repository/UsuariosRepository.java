package com.ejemplo.demo.repository;

import com.ejemplo.demo.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsuariosRepository extends JpaRepository<Usuarios,Long> {

    @Query(nativeQuery = true,
            value = "UPDATE usuarios " +
                    "SET estado_cliente=false " +
                    "WHERE valor_documento_cliente=:documento")
    Usuarios disableUser(@Param(value = "documento") String documento);

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
    List<Usuarios> findAllUsersActives();


}
