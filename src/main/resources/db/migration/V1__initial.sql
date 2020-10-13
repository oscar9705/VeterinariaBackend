CREATE TABLE public.veterinarias
(
    id_veterinaria serial NOT NULL,
    nit_veterinaria character varying(20) NOT NULL,
    nombre_veterinaria character varying(10) NOT NULL,
    correo_veterinaria character varying(100) NOT NULL,
    estado_veterinaria boolean NOT NULL,
    fk_duenio_veterinaria integer ,
    PRIMARY KEY (id_veterinaria)
);

ALTER TABLE public.veterinarias
    OWNER to postgres;

    CREATE TABLE public.sucursales
(
    id_sucursal serial NOT NULL,
    direccion_sucursal character varying(100) NOT NULL,
    telefono_sucursal character varying(100)  NOT NULL,
    imagen_sucursal character varying(100) NOT NULL,
    fk_admin_sucursal integer ,
    fk_veterinaria integer ,
    PRIMARY KEY (id_sucursal)
);

ALTER TABLE public.sucursales
    OWNER to postgres;
CREATE TABLE public.usuarios
(
    id_cliente serial NOT NULL,
    nombres_cliente character varying(20) NOT NULL,
    apellidos_cliente character varying(20) NOT NULL,
    tipo_documento_cliente character varying(20) NOT NULL,
    valor_documento_cliente character varying(100) NOT NULL,
    fecha_nacimiento_cliente date NOT NULL,
    departamento_residencia_cliente character varying(60) NOT NULL,
    ciudad_residencia_cliente character varying(60) NOT NULL,
    barrio_residencia_cliente character varying(60) NOT NULL,
    telefono_cliente character varying(70) NOT NULL,
    correo_cliente character varying(30) NOT NULL,
    contrasenia_cliente character varying(30) NOT NULL,
    estado_cliente boolean NOT NULL,
    rol character varying(20) NOT NULL,
    PRIMARY KEY (id_cliente)
);

ALTER TABLE public.usuarios
    OWNER to postgres;