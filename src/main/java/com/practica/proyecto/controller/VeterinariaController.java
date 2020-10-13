package com.practica.proyecto.controller;


import com.practica.proyecto.model.Usuario;
import com.practica.proyecto.model.Veterinaria;
import com.practica.proyecto.service.VeterinariaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/veterinaria")
@Api("Veterinaria")
public class VeterinariaController {
    private final VeterinariaService veterinariaService;
    @Autowired
    public VeterinariaController(VeterinariaService veterinariaService) {
        this.veterinariaService = veterinariaService;
    }

    @PostMapping(path = "/save")
    @ApiOperation(value = "agregue veterinaria", response = Veterinaria.class)
    public Veterinaria saveVeterinaria(@RequestBody Veterinaria veterinaria){
        return veterinariaService.saveVeterinaria(veterinaria);
    }

    @DeleteMapping(path = "/delete")
    @ApiOperation(value = "elimine una veterinaria", response = Veterinaria.class)
    public void deleteVeterinaria(@RequestParam(name="id") Long id){
        veterinariaService.deleteVeterinaria(id);
    }

    @PutMapping(path = "/update")
    @ApiOperation(value = "actualice veterinaria", response = Veterinaria.class)
    public Veterinaria updateVeterinaria(@RequestBody Veterinaria veterinaria){
        return veterinariaService.updateVeterinaria(veterinaria);
    }

    @GetMapping(path = "/all")
    @ApiOperation(value = "Encontrar todas las veterinarias", response = Veterinaria.class)
    public List<Veterinaria> findAll(){
        return veterinariaService.findAll();
    }

    @GetMapping(path = "/id")
    @ApiOperation(value = "Encontrar una veterinaria por id", response = Veterinaria.class)
    public Optional<Veterinaria> findById(@RequestParam(name="id") Long id){
        return  veterinariaService.findById(id);
    }

    @GetMapping(path = "/allActive")
    @ApiOperation(value = "Encontrar todas las veterinarias activas", response = Veterinaria.class)
    public List<Veterinaria> findAllVeterinariansActives(){return  veterinariaService.findAllVeterinariansActives();}

    @PatchMapping(path = "/disableVeterinary")
    @ApiOperation(value = "Deshabilitar una veterinaria por nit", response = Veterinaria.class)
    public int disableVeterinary(@RequestParam(name = "nit") String nit){return veterinariaService.disableVeterinary(nit);}
}
