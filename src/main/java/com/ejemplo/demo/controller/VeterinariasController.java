package com.ejemplo.demo.controller;


import com.ejemplo.demo.model.Veterinarias;
import com.ejemplo.demo.service.VeterinariasService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/veterinarias")
public class VeterinariasController {

    private final VeterinariasService veterinariasService;

    @Autowired
    public VeterinariasController(VeterinariasService veterinariasService){this.veterinariasService = veterinariasService;}

    @GetMapping(path = "/all")
    @ApiOperation(value = "Insert veterinarians", response = Veterinarias.class)
    public List<Veterinarias> findAll(){return  veterinariasService.findAllVeterinariansActives();}

}
