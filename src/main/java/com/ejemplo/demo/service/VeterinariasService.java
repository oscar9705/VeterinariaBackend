package com.ejemplo.demo.service;

import com.ejemplo.demo.model.Veterinarias;
import com.ejemplo.demo.repository.VeterinariasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VeterinariasService {
    private final VeterinariasRepository veterinariasRepository;

    @Autowired
    public VeterinariasService(VeterinariasRepository veterinariasRepository){this.veterinariasRepository = veterinariasRepository;}

    public List<Veterinarias> findAllVeterinariansActives(){return veterinariasRepository.findAllVeterinariansActives();}

    public Veterinarias disableUser(String nit){return veterinariasRepository.disableVeterinary(nit);}
}
