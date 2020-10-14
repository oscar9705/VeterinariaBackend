package com.practica.proyecto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "veterinarias")
public class Veterinaria {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name= "id_veterinaria")
    private Long idVet;

    @Column(name = "nombre_veterinaria")
    private String nombre;

    @Column(name = "nit_veterinaria")
    private String nit;

    @Column(name = "correo_veterinaria")
    private String correo;

    @Column(name= "estado_veterinaria")
    private Boolean estado;

    @Column(name = "fk_duenio_veterinaria")
    private Integer duenio;

    @OneToMany(mappedBy = "veterinaria")
    List<Sucursal> sucursalList;

    public Veterinaria(Long idVet, String nombre, String nit, String correo, Boolean estado, Integer duenio) {
        this.idVet = idVet;
        this.nombre = nombre;
        this.nit = nit;
        this.correo = correo;
        this.estado = estado;
        this.duenio = duenio;
    }

    public Veterinaria() {
    }

    public Long getIdVet() {
        return idVet;
    }

    public void setIdVet(Long idVet) {
        this.idVet = idVet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Integer getDuenio() {
        return duenio;
    }

    public void setDuenio(Integer duenio) {
        this.duenio = duenio;
    }
    @JsonIgnore
    public List<Sucursal> getSucursalList() {
        return sucursalList;
    }

    public void setSucursalList(List<Sucursal> sucursalList) {
        this.sucursalList = sucursalList;
    }


}
