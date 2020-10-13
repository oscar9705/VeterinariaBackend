package com.ejemplo.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Veterinarias")
public class Veterinarias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_veterinaria")
    private Long id;

    @Column(name = "nombre_veterinaria")
    private String nombreVeterinaria;

    @Column(name = "nit_veterinaria")
    private String nitVeterinaria;

    @Column(name = "correo_veterinaria")
    private String correoVeterinaria;

    @Column(name = "estado_veterinaria")
    private String stadoVeterinaria;

    @Column(name = "fk_duenio_veterinaria")
    private Long duenioVeterinaria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreVeterinaria() {
        return nombreVeterinaria;
    }

    public void setNombreVeterinaria(String nombreVeterinaria) {
        this.nombreVeterinaria = nombreVeterinaria;
    }

    public String getNitVeterinaria() {
        return nitVeterinaria;
    }

    public void setNitVeterinaria(String nitVeterinaria) {
        this.nitVeterinaria = nitVeterinaria;
    }

    public String getCorreoVeterinaria() {
        return correoVeterinaria;
    }

    public void setCorreoVeterinaria(String correoVeterinaria) {
        this.correoVeterinaria = correoVeterinaria;
    }

    public String getStadoVeterinaria() {
        return stadoVeterinaria;
    }

    public void setStadoVeterinaria(String stadoVeterinaria) {
        this.stadoVeterinaria = stadoVeterinaria;
    }

    public Long getDuenioVeterinaria() {
        return duenioVeterinaria;
    }

    public void setDuenioVeterinaria(Long duenioVeterinaria) {
        this.duenioVeterinaria = duenioVeterinaria;
    }

    public Veterinarias() {
    }

    public Veterinarias(Long id,
                        String nombreVeterinaria,
                        String nitVeterinaria,
                        String correoVeterinaria,
                        String stadoVeterinaria,
                        Long duenioVeterinaria) {
        this.id = id;
        this.nombreVeterinaria = nombreVeterinaria;
        this.nitVeterinaria = nitVeterinaria;
        this.correoVeterinaria = correoVeterinaria;
        this.stadoVeterinaria = stadoVeterinaria;
        this.duenioVeterinaria = duenioVeterinaria;
    }
}
