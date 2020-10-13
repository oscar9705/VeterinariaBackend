package com.practica.proyecto.service;

import com.practica.proyecto.model.Sucursal;
import com.practica.proyecto.model.Veterinaria;
import com.practica.proyecto.repository.VeterinariaRepository;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VeterinariaServiceTest {

    private static final Long ID = Long.valueOf(1);
    private static final int ID_DUENIO = 1;
    private static final String NOMBRE = "patitas";
    private static final String NIT = "111111111";
    private static final String CORREO = "patitas@gmail.com";
    private static final Boolean ESTADO = true;
    private static List<Sucursal> SUCURSAL_LIST = new ArrayList<>();
    private static final Veterinaria VETERINARIA = new Veterinaria();
    private static final Optional<Veterinaria> OPTIONAL_VETERINARIA = Optional.of(VETERINARIA);

    @Mock
    private VeterinariaRepository veterinariaRepository;
    @InjectMocks
    VeterinariaService veterinariaService;
    @BeforeEach
     public void init(){
        MockitoAnnotations.initMocks(this);
        VETERINARIA.setNombre(NOMBRE);
        VETERINARIA.setNit(NIT);
        VETERINARIA.setCorreo(CORREO);
        VETERINARIA.setEstado(ESTADO);
        VETERINARIA.setDuenio(ID_DUENIO);
        VETERINARIA.setSucursalList(SUCURSAL_LIST);


    }
    @Test
    public void findByIdTest(){
        Mockito.when(veterinariaRepository.findById(ID)).thenReturn(OPTIONAL_VETERINARIA);
        veterinariaService.findById(ID);

    }


}
