package com.practica.proyecto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mascota")
public class Mascota {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name= "id_mascota")
    private Long id_mascota;

    @Column(name = "nombre_mascota")
    private String nombre_mascota;

    @Column(name = "especie_mascota")
    private String especie_mascota;

    @Column(name = "edad_mascota")
    private String edad_mascota;

    @Column(name = "raza_mascota")
    private String raza_mascota;

    @Column(name = "sexo_mascota")
    private String sexo_mascota;

    @Column(name = "observaciones")
    private String observaciones;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "fk_duenio")
    Usuario usuario;

    @Column(name = "estado_mascota")
    private boolean estado_mascota ;


    public Mascota() {
    }

    public Mascota(Long id_mascota, String nombre_mascota, String especie_mascota, String edad_mascota, String raza_mascota, String sexo_mascota, String observaciones, boolean estado_mascota) {
        this.id_mascota = id_mascota;
        this.nombre_mascota = nombre_mascota;
        this.especie_mascota = especie_mascota;
        this.edad_mascota = edad_mascota;
        this.raza_mascota = raza_mascota;
        this.sexo_mascota = sexo_mascota;
        this.observaciones = observaciones;
        this.estado_mascota = estado_mascota;
    }

    public Long getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(Long id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public String getEspecie_mascota() {
        return especie_mascota;
    }

    public void setEspecie_mascota(String especie_mascota) {
        this.especie_mascota = especie_mascota;
    }

    public String getEdad_mascota() {
        return edad_mascota;
    }

    public void setEdad_mascota(String edad_mascota) {
        this.edad_mascota = edad_mascota;
    }

    public String getRaza_mascota() {
        return raza_mascota;
    }

    public void setRaza_mascota(String raza_mascota) {
        this.raza_mascota = raza_mascota;
    }

    public String getSexo_mascota() {
        return sexo_mascota;
    }

    public void setSexo_mascota(String sexo_mascota) {
        this.sexo_mascota = sexo_mascota;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }


    public boolean isEstado_mascota() {
        return estado_mascota;
    }

    public void setEstado_mascota(boolean estado_mascota) {
        this.estado_mascota = estado_mascota;
    }
}
