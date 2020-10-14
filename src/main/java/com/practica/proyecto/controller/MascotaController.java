package com.practica.proyecto.controller;

import com.practica.proyecto.model.Mascota;
import com.practica.proyecto.model.Sucursal;
import com.practica.proyecto.model.Usuario;
import com.practica.proyecto.model.Veterinaria;
import com.practica.proyecto.service.MascotaService;
import com.practica.proyecto.service.UsuarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mascota")
@Api("mascota")
public class MascotaController {

    private final MascotaService mascotaService;

    @Autowired
    public MascotaController(MascotaService mascotaService){this.mascotaService = mascotaService;}
    @PatchMapping(path = "/disableMascota")
    @ApiOperation(value = "deshabilitar mascota", response = Mascota.class)
    public int disableUser(@RequestParam(name = "nombre_mascota") String nombre_mascota){
        return mascotaService.disableUser(nombre_mascota);}

    @PostMapping(path = "/saveMascota")
    @ApiOperation(value = "agregue mascota", response = Mascota.class)
    public Mascota saveMascota(@RequestBody Mascota mascota){
        return mascotaService.saveMascota(mascota);
    }

    @DeleteMapping(path = "/deleteMascota")
    @ApiOperation(value = "elimine una mascota", response = Mascota.class)
    public void deleteMascota(@RequestParam(name="id_mascota") Long id_mascota){
        mascotaService.deleteMascota(id_mascota);
    }

}





