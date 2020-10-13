package com.practica.proyecto.service;

import com.practica.proyecto.model.Sucursal;
import com.practica.proyecto.model.Veterinaria;
import com.practica.proyecto.model.VeterinariaDTO;
import com.practica.proyecto.repository.SucursalRepository;
import com.practica.proyecto.repository.VeterinariaRepository;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class VeterinariaServiceTest {
    private static final Long ID_SUC = Long.valueOf(1);
    private static final String DIRECCION = "CRA 80";
    private static final String TELEFONO = "4454341";
    private static final String IMAGEN = "foto.jpg";


    private static final Long ID = Long.valueOf(1);
    private static final int ID_DUENIO = 1;
    private static final String NOMBRE = "patitas";
    private static final String NIT = "111111111";
    private static final String CORREO = "patitas@gmail.com";
    private static final Boolean ESTADO = true;
    private static List<Sucursal> SUCURSAL_LIST = new ArrayList<>();
    private static final Veterinaria VETERINARIA = new Veterinaria();
    private static final Sucursal SUCURSAL = new Sucursal();
    private static final VeterinariaDTO VETERINARIA_DTO = new VeterinariaDTO();
    private static final Optional<Veterinaria> OPTIONAL_VETERINARIA = Optional.of(VETERINARIA);
    private static final Optional<Sucursal> OPTIONAL_SUCURSAL = Optional.of(SUCURSAL);
    private static final Optional<VeterinariaDTO> OPTIONAL_VETERINARIA_DTO = Optional.of(VETERINARIA_DTO);

    @Mock
    private VeterinariaRepository veterinariaRepository;

    @Mock
    private SucursalRepository sucursalRepository;
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

        VETERINARIA_DTO.setNombreVet(NOMBRE);
        VETERINARIA_DTO.setNit(NIT);
        VETERINARIA_DTO.setCorreo(CORREO);
        VETERINARIA_DTO.setTelefono(TELEFONO);
        VETERINARIA_DTO.setImagen(IMAGEN);

        SUCURSAL.setDireccion(DIRECCION);
        SUCURSAL.setImagen(IMAGEN);
        SUCURSAL.setTelefono(TELEFONO);
        SUCURSAL.setVeterinaria(VETERINARIA);






    }
    @Test
    void findByIdTest(){
        Mockito.when(veterinariaRepository.findById(ID)).thenReturn(OPTIONAL_VETERINARIA);
        veterinariaService.findById(ID);

    }
    @Test
    void findByAllTest(){
        final Veterinaria veterinaria = new Veterinaria();
        Mockito.when(veterinariaRepository.findAll()).thenReturn(Arrays.asList(veterinaria));
        final List<Veterinaria> resp = veterinariaService.findAll();
        assertNotNull(resp);
        assertFalse(resp.isEmpty());
        assertEquals(resp.size(), 1);

    }

    @Test
    void findbyIdVetSucTest(){
        Mockito.when(veterinariaRepository.findById(ID)).thenReturn(OPTIONAL_VETERINARIA);
        Mockito.when(sucursalRepository.findById(ID_SUC)).thenReturn(OPTIONAL_SUCURSAL);

        final Optional<VeterinariaDTO> resp = veterinariaService.findbyIdVetSuc(ID,ID_SUC);
        assertNotNull(resp);

    }


}
