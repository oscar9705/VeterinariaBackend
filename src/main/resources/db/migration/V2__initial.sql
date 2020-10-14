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