package com.practica.proyecto.controller;

import com.practica.proyecto.model.Sucursal;
import com.practica.proyecto.service.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sucursal")
public class SucursalController {
    private final SucursalService sucursalService;
    @Autowired
    public SucursalController(SucursalService sucursalService) {
        this.sucursalService = sucursalService;
    }


    @PostMapping(path = "/save")
    public Sucursal saveSucursal(@RequestBody Sucursal sucursal){
        return sucursalService.saveSucursal(sucursal);
    }

    @PutMapping(path = "/update")
    public Sucursal updateSucursal(@RequestBody Sucursal sucursal){
        return sucursalService.updateSucursal(sucursal);
    }
    @GetMapping(path = "/all")
    public List<Sucursal> findAll(){
        return sucursalService.findAll();
    }
    @GetMapping(path = "/{id}")
    public Optional<Sucursal> findById(@PathParam("id") Long id){
        return  sucursalService.findById(id);
    }
}
