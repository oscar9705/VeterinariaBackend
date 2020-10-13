package com.practica.proyecto.controller;

import com.practica.proyecto.model.Usuario;
import com.practica.proyecto.service.UsuarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@Api("Usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService){this.usuarioService = usuarioService;}

    @PatchMapping(path = "/disableUser")
    @ApiOperation(value = "Insert Users", response = Usuario.class)
    public int disableUser(@RequestParam(name = "documento") String documento){return usuarioService.disableUser(documento);}


    @PatchMapping(path = "/AceptarColaborador")
    @ApiOperation(value = "Aceptar Colaborador", response = Usuario.class)
    public Usuario cambiarEstadoColaborador(@RequestParam(name = "documento") String documento){return usuarioService.cambiarEstadoColaborador(documento);}

    @GetMapping(path = "/allActive")
    @ApiOperation(value = "Insert Users", response = Usuario.class)
    public List<Usuario> findAll(){return  usuarioService.findAllUsersActives();}

    @PatchMapping(path = "/aceptarColaborador")
    @ApiOperation(value = "Aceptar Colaborador", response = Usuario.class)
    public int cambiarEstadoColaborador(@RequestParam(name = "documento") String documento){return usuarioService.cambiarEstadoColaborador(documento);}

}
