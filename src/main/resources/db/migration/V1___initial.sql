CREATE TABLE "students" (
    st_id serial NOT NULL,
    st_first_name character varying(100) NOT NULL,
    st_second_name character varying(100),
    st_first_surname character varying(100) NOT NULL,
    st_second_surname character varying(100) NOT NULL,
    st_number_id integer NOT NULL,
    st_active boolean NOT NULL,
    PRIMARY KEY (st_id)
);

ALTER TABLE "students" OWNER to postgres;

