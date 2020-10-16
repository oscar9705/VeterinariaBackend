package com.practica.proyecto.service;

import com.practica.proyecto.model.Mascota;
import com.practica.proyecto.repository.MascotaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

public class MascotaServiceTest {

    private static final Long ID_MASCOTA = Long.valueOf(1);
    private static final String NAMEPET = "skylie";
    private static final String SPECIEPET = "skylie";
    private static final String EDAD_MASCOTA = "2";
    private static final String RAZA = "chriollo.";
    private static final String SEXPET = "macho.";
    private static final String OBSERVAPET = "negro.";
    private static final Boolean ACTIVE = true;

    private static final Mascota MASCOTA = new Mascota();
    private static final Optional<Mascota> OPTIONAL_MASCOTS= Optional.of(MASCOTA);

    @Mock
    private MascotaRepository mascotaRepository;

    @InjectMocks
    MascotaService mascotaService;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
        MASCOTA.setNombre_mascota(NAMEPET);
        MASCOTA.setEspecie_mascota(SPECIEPET);
        MASCOTA.setEdad_mascota(EDAD_MASCOTA);
        MASCOTA.setRaza_mascota(RAZA);
        MASCOTA.setSexo_mascota(SEXPET);
        MASCOTA.setObservaciones(OBSERVAPET);
        MASCOTA.setEstado_mascota(ACTIVE);

    }
    
    @Test
    void findByIdTestMa() {
        Mockito.when(mascotaRepository.findById(ID_MASCOTA)).thenReturn(OPTIONAL_MASCOTS);
        mascotaService.findById(ID_MASCOTA);
    }

    }
