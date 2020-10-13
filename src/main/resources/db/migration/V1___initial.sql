CREATE TABLE "usuarios" (
    id_cliente serial NOT NULL,
    nombres_cliente character varying(100) NOT NULL,
    apellidos_cliente character varying(100) NOT NULL,
    tipo_documento_cliente character varying(100) NOT NULL,
    valor_documento_cliente character varying(100) NOT NULL,
    fecha_nacimiento_cliente date NOT NULL,
    departamento_residencia_cliente character varying(100) NOT NULL,
    ciudad_residencia_cliente character varying(100) NOT NULL,
    barrio_residencia_cliente character varying(100) NOT NULL,
    telefono_cliente character varying(100) NOT NULL,
    correo_cliente character varying(100) NOT NULL,
    contrasenia_cliente character varying(100) NOT NULL,
    estado_cliente boolean NOT NULL,
    rol character varying(100) NOT NULL,
    PRIMARY KEY (id_cliente)
);

ALTER TABLE "usuarios" OWNER to postgres;

CREATE TABLE "veterinarias" (
    id_veterinaria serial NOT NULL,
    nombre_veterinaria character varying(100) NOT NULL,
    nit_veterinaria character varying(100) NOT NULL,
    correo_veterinaria character varying(100) NOT NULL,
    estado_veterinaria boolean NOT NULL,
    fk_duenio_veterinaria serial NOT NULL,
    PRIMARY KEY (id_veterinaria),
    CONSTRAINT fk_duenio_veterinaria FOREIGN KEY (fk_duenio_veterinaria) REFERENCES usuarios (id_cliente)
);

ALTER TABLE "veterinarias" OWNER to postgres;

CREATE TABLE "sucursales" (
    id_sucursal serial NOT NULL,
    direccion_sucursal character varying(100) NOT NULL,
    telefono_sucursal character varying(100) NOT NULL,
    imagen_sucursal character varying(100) NOT NULL,
    fk_admin_sucursal serial NOT NULL,
    fk_veterinaria serial NOT NULL,
    PRIMARY KEY (id_sucursal),
    CONSTRAINT fk_admin_sucursal FOREIGN KEY (fk_admin_sucursal) REFERENCES usuarios (id_cliente),
    CONSTRAINT fk_veterinaria FOREIGN KEY (fk_veterinaria) REFERENCES veterinarias (id_veterinaria)
);

ALTER TABLE "sucursales" OWNER to postgres;