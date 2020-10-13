package com.ejemplo.demo.controller;

import com.ejemplo.demo.model.Usuarios;
import com.ejemplo.demo.service.UsuariosService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    private final UsuariosService usuariosService;

    @Autowired
    public UsuariosController(UsuariosService usuariosService){this.usuariosService = usuariosService;}

    @PatchMapping(path = "/disableUser")
    @ApiOperation(value = "Insert Users", response = Usuarios.class)
    public Usuarios disableUser(@RequestParam(name = "documento") String documento){return usuariosService.disableUser(documento);}

    @GetMapping(path = "/all")
    @ApiOperation(value = "Insert Users", response = Usuarios.class)
    public List<Usuarios> findAll(){return  usuariosService.findAllUsersActives();}
}
