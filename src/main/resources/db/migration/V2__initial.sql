CREATE TABLE public.mascota
(
    id_mascota serial NOT NULL,
    nombre_mascota character varying(100) NOT NULL,
    especie_mascota character varying(100) NOT NULL,
    edad_mascota character varying(100) NOT NULL,
    raza_mascota character varying(100) NOT NULL,
    sexo_mascota character varying(100) NOT NULL,
    observaciones character varying(500) NOT NULL,
    fk_duenio integer,
    estado_mascota boolean NOT NULL,
    PRIMARY KEY (id_mascota)
);

ALTER TABLE public.mascota
    OWNER to postgres;

    INSERT INTO public.veterinarias(
	id_veterinaria, nit_veterinaria, nombre_veterinaria, correo_veterinaria, estado_veterinaria)
	VALUES (1, '1111111', 'patitas', 'patitas@gmail.com', true);

INSERT INTO public.veterinarias(
	id_veterinaria, nit_veterinaria, nombre_veterinaria, correo_veterinaria, estado_veterinaria)
	VALUES (2, '2222222', 'suaves', 'suaves@gmail.com', true);

INSERT INTO public.sucursales(
	id_sucursal, direccion_sucursal, telefono_sucursal, imagen_sucursal, fk_veterinaria)
	VALUES (1, 'Cra 80', '3332121', 'img.jpg', 1);

INSERT INTO public.usuarios(
	nombres_cliente,apellidos_cliente,tipo_documento_cliente, valor_documento_cliente, fecha_nacimiento_cliente, departamento_residencia_cliente, ciudad_residencia_cliente, barrio_residencia_cliente, telefono_cliente, correo_cliente, contrasenia_cliente, estado_cliente, rol)
	VALUES ('GERMAN',
			'DELGADO JIMENEZ', 'CC', '1112496720', '1999-04-19', 'VAC', 'JAMUNDI', 'LIBERTADORES', '3163223713', 'german-1-9@hotmail.com', 'German0419', true, 'ADMIN');
;
INSERT INTO public.usuarios(
	nombres_cliente, apellidos_cliente, tipo_documento_cliente, valor_documento_cliente, fecha_nacimiento_cliente, departamento_residencia_cliente, ciudad_residencia_cliente, barrio_residencia_cliente, telefono_cliente, correo_cliente, contrasenia_cliente, estado_cliente, rol)
	VALUES ('ARI', 'VALENCIA', 'CC', '1112496721', '1999-04-12', 'VAC', 'CALI', 'SILOE', '3163223715', 'ari-13@hotmail.com', 'Ari1234', true, 'VET');
