package com.practica.proyecto.model;

import java.io.Serializable;

public class VeterinariaDTO implements Serializable{
   private String nombreVet;
   private String nit;
   private String correo;
   private String direccion;
   private String telefono;
   private String imagen;

    public VeterinariaDTO() {
    }

    public VeterinariaDTO(String nombreVet, String nit, String correo, String direccion, String telefono, String imagen) {
        this.nombreVet = nombreVet;
        this.nit = nit;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.imagen = imagen;
    }

    public String getNombreVet() {
        return nombreVet;
    }

    public void setNombreVet(String nombreVet) {
        this.nombreVet = nombreVet;
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
}
