package com.ejemplo.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Usuarios")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Long id;

    @Column(name = "nombres_cliente")
    private String nombreUsuario;

    @Column(name = "apellidos_cliente")
    private String apellidosUsuario;

    @Column(name = "tipo_documento_cliente")
    private String tipoDocumento;

    @Column(name = "valor_documento_cliente")
    private String numeroDocumento;

    @Column(name = "fecha_nacimiento_cliente")
    private Date fechaNacimiento;

    @Column(name = "departamento_residencia_cliente")
    private String departamentoResidenciaUsuario;

    @Column(name = "ciudad_residencia_cliente")
    private String ciudadResidenciaUsuario;

    @Column(name = "barrio_residencia_cliente")
    private String barrioResidenciaUsuario;

    @Column(name = "telefono_cliente")
    private String telefonoUsuario;

    @Column(name = "correo_cliente")
    private String correoUsuario;

    @Column(name = "contrasenia_cliente")
    private String contraseniaCliente;

    @Column(name = "estado_cliente")
    private Boolean estadoCliente;

    @Column(name = "rol")
    private String rol;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidosUsuario() {
        return apellidosUsuario;
    }

    public void setApellidosUsuario(String apellidosUsuario) {
        this.apellidosUsuario = apellidosUsuario;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDepartamentoResidenciaUsuario() {
        return departamentoResidenciaUsuario;
    }

    public void setDepartamentoResidenciaUsuario(String departamentoResidenciaUsuario) {
        this.departamentoResidenciaUsuario = departamentoResidenciaUsuario;
    }

    public String getCiudadResidenciaUsuario() {
        return ciudadResidenciaUsuario;
    }

    public void setCiudadResidenciaUsuario(String ciudadResidenciaUsuario) {
        this.ciudadResidenciaUsuario = ciudadResidenciaUsuario;
    }

    public String getBarrioResidenciaUsuario() {
        return barrioResidenciaUsuario;
    }

    public void setBarrioResidenciaUsuario(String barrioResidenciaUsuario) {
        this.barrioResidenciaUsuario = barrioResidenciaUsuario;
    }

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getContraseniaCliente() {
        return contraseniaCliente;
    }

    public void setContraseniaCliente(String contraseniaCliente) {
        this.contraseniaCliente = contraseniaCliente;
    }

    public Boolean getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(Boolean estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Usuarios() {
    }

    public Usuarios(Long id,
                    String nombreUsuario,
                    String apellidosUsuario,
                    String tipoDocumento,
                    String numeroDocumento,
                    Date fechaNacimiento,
                    String departamentoResidenciaUsuario,
                    String ciudadResidenciaUsuario,
                    String barrioResidenciaUsuario,
                    String telefonoUsuario,
                    String correoUsuario,
                    String contraseniaCliente,
                    Boolean estadoCliente,
                    String rol) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.apellidosUsuario = apellidosUsuario;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.fechaNacimiento = fechaNacimiento;
        this.departamentoResidenciaUsuario = departamentoResidenciaUsuario;
        this.ciudadResidenciaUsuario = ciudadResidenciaUsuario;
        this.barrioResidenciaUsuario = barrioResidenciaUsuario;
        this.telefonoUsuario = telefonoUsuario;
        this.correoUsuario = correoUsuario;
        this.contraseniaCliente = contraseniaCliente;
        this.estadoCliente = estadoCliente;
        this.rol = rol;
    }
}
