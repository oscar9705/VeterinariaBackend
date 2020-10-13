package com.practica.proyecto.service;

import com.practica.proyecto.model.Veterinaria;
import com.practica.proyecto.repository.VeterinariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VeterinariaService {
    private final VeterinariaRepository veterinariaRepository;

    @Autowired
    public VeterinariaService(VeterinariaRepository veterinariaRepository) {
        this.veterinariaRepository = veterinariaRepository;
    }

    public Veterinaria saveVeterinaria(Veterinaria veterinaria){
        return veterinariaRepository.save(veterinaria);
    }

    public Veterinaria updateVeterinaria(Veterinaria veterinaria){
        return veterinariaRepository.save(veterinaria);
    }
    public Optional<Veterinaria> findById(Long id){
        return veterinariaRepository.findById(id);
    }
    public List<Veterinaria> findAll(){
        List<Veterinaria> vet = veterinariaRepository.findAll();
        System.out.println(vet.size());

        return vet;
    }

    public void deleteVeterinaria (Long id) {
        veterinariaRepository.deleteById(id);
    }

    public List<Veterinaria> findAllVeterinariansActives(){return veterinariaRepository.findAllVeterinariansActives();}

    public Veterinaria disableVeterinary(String nit){return veterinariaRepository.disableVeterinary(nit);}
}
