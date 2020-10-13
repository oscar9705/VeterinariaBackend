package com.practica.proyecto.service;

import com.practica.proyecto.repository.VeterinariaRepository;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.MockitoAnnotations;

public class VeterinariaServiceTest {

    private static final int ID = 1;
    @Mock
    private VeterinariaRepository veterinariaRepository;
    @InjectMocks
    VeterinariaService veterinariaService;
    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void findByIdTest(){

    }


}
