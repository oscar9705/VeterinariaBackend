package com.practica.proyecto.service;

import com.practica.proyecto.model.Usuario;
import com.practica.proyecto.repository.UsuarioRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class UsuarioServiceTest {

    private static final Long ID_USER = Long.valueOf(1);
    private static final String NOMBRES_USER = "GERMAN";
    private static final String APELLIDOS_USER = "DELGADO JIMENEZ";
    private static final String TIPO_DOCUMENTO = "CC";
    private static final String VALOR_DOCUMENTO = "1112496720";
    private static final Date FECHA_NACIMIENTO = new Date(1999,04,19);
    private static final String DEPARTAMENTO = "VAC";
    private static final String CIUDAD = "JAMUNDI";
    private static final String BARRIO = "LIBERTADORES";
    private static final String TELEFONO = "3163223713";
    private static final String CORREO_USER = "german-1-9@hotmail.com";
    private static final String CONTRASENIA_USER = "German0419";
    private static final Boolean ESTADO_USER = true;
    private static final String ROL = "ADMIN";
    private static final Usuario USUARIO = new Usuario();

    @Mock
    private UsuarioRepository usuarioRepository;

    @InjectMocks
    UsuarioService usuarioService;

    @BeforeEach
    public void init(){
        MockitoAnnotations.initMocks(this);
        USUARIO.setId(ID_USER);
        USUARIO.setNombre(NOMBRES_USER);
        USUARIO.setApellido(APELLIDOS_USER);
        USUARIO.setTipoDocumento(TIPO_DOCUMENTO);
        USUARIO.setValorDocumento(VALOR_DOCUMENTO);
        USUARIO.setFechaNacimiento(FECHA_NACIMIENTO);
        USUARIO.setDepartamento(DEPARTAMENTO);
        USUARIO.setCiudad(CIUDAD);
        USUARIO.setBarrio(BARRIO);
        USUARIO.setTelefono(TELEFONO);
        USUARIO.setCorreo(CORREO_USER);
        USUARIO.setContrasenia(CONTRASENIA_USER);
        USUARIO.setEstado(ESTADO_USER);
        USUARIO.setRol(ROL);
    }

    @Test
    void disableUserTest () {
        Mockito.when(usuarioRepository.disableUser(VALOR_DOCUMENTO)).thenReturn(1);
    }

    @Test
    void findAllUsersActivesTest () {
        final Usuario usuario = new Usuario();
        Mockito.when(usuarioRepository.findAllUsersActives()).thenReturn(Arrays.asList(usuario));
        final List<Usuario> resp = usuarioService.findAllUsersActives();
        assertNotNull(resp);
        assertFalse(resp.isEmpty());
        assertEquals(resp.size(),1);
    }


}
