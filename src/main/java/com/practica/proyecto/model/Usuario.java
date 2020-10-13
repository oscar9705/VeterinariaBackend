package com.practica.proyecto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Long id;
    @Column(name = "nombres_cliente")
    private String nombre;
    @Column(name = "apellidos_cliente")
    private String apellido;
    @Column(name = "tipo_documento_cliente")
    private String tipoDocumento;
    @Column(name = "valor_documento_cliente")
    private String valorDocumento;
    @Column(name = "fecha_nacimiento_cliente")
    private Date fechaNacimiento;
    @Column(name = "departamento_residencia_cliente")
    private String departamento;
    @Column(name = "ciudad_residencia_cliente")
    private String ciudad;
    @Column(name = "barrio_residencia_cliente")
    private String barrio;
    @Column(name = "telefono_cliente")
    private String telefono;
    @Column(name = "correo_cliente")
    private String correo;
    @Column(name = "contrasenia_cliente")
    private String contrasenia;
    @Column(name = "estado_cliente")
    private Boolean estado;
    @Column( name = "rol")
    private String rol;

    public Usuario() {
    }

    public Usuario(Usuario usuario) {
        this.id = usuario.id;
        this.nombre = usuario.nombre;
        this.apellido = usuario.apellido;
        this.tipoDocumento = usuario.tipoDocumento;
        this.valorDocumento = usuario.valorDocumento;
        this.fechaNacimiento = usuario.fechaNacimiento;
        this.departamento = usuario.departamento;
        this.ciudad = usuario.ciudad;
        this.barrio = usuario.barrio;
        this.telefono = usuario.telefono;
        this.correo = usuario.correo;
        this.contrasenia = usuario.contrasenia;
        this.estado = usuario.estado;
        this.rol = usuario.rol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getValorDocumento() {
        return valorDocumento;
    }

    public void setValorDocumento(String valorDocumento) {
        this.valorDocumento = valorDocumento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Boolean getEstado() {return estado;}

    public void setEstado(Boolean estado) {this.estado = estado;}

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
