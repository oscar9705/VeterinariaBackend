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
@Table(name = "sucursales")
public class Sucursal {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name= "id_sucursal")
    private Long idSuc;

    @Column(name = "direccion_sucursal")
    private String direccion;

    @Column(name = "telefono_sucursal")
    private String telefono;

    @Column(name= "imagen_sucursal")
    private String imagen;

    @Column(name = "fk_admin_sucursal")
    private Long fkAdmin;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "fk_veterinaria")
    Veterinaria veterinaria;

    public Sucursal(Long idSuc, String direccion, String telefono, String imagen) {
        this.idSuc = idSuc;
        this.direccion = direccion;
        this.telefono = telefono;
        this.imagen = imagen;
        this.fkAdmin = null;
    }

    public Sucursal() {
    }

    public Long getIdSuc() {
        return idSuc;
    }

    public void setIdSuc(Long idSuc) {
        this.idSuc = idSuc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Long getFkAdmin() {
        return fkAdmin;
    }

    public void setFkAdmin(Long fkAdmin) {
        this.fkAdmin = fkAdmin;
    }

    public Veterinaria getVeterinaria() {
        return veterinaria;
    }

    public void setVeterinaria(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }
}
