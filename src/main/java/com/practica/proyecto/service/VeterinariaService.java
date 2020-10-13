package com.practica.proyecto.service;

import com.practica.proyecto.model.Sucursal;
import com.practica.proyecto.model.Veterinaria;
import com.practica.proyecto.model.VeterinariaDTO;
import com.practica.proyecto.repository.SucursalRepository;
import com.practica.proyecto.repository.VeterinariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeterinariaService {
    private final VeterinariaRepository veterinariaRepository;
    private final SucursalRepository sucursalRepository;


    @Autowired
    public VeterinariaService(VeterinariaRepository veterinariaRepository, SucursalRepository sucursalRepository) {
        this.veterinariaRepository = veterinariaRepository;
        this.sucursalRepository = sucursalRepository;
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
    public Optional<VeterinariaDTO> findbyIdVetSuc(Long idVet,Long idSuc){
        Optional<VeterinariaDTO> vetOpt = Optional.of(new VeterinariaDTO());
        VeterinariaDTO vetDto = new VeterinariaDTO();
        Optional<Veterinaria> vet = veterinariaRepository.findById(idVet);
        Optional<Sucursal> suc = sucursalRepository.findById(idSuc);
        if(vetOpt.isPresent()) {
            vetDto.setNit(vet.get().getNit());
            vetDto.setNombreVet(vet.get().getNombre());
            vetDto.setCorreo(vet.get().getCorreo());
            vetDto.setDireccion(suc.get().getDireccion());
            vetDto.setTelefono(suc.get().getTelefono());
            vetDto.setImagen(suc.get().getImagen());
            vetOpt = Optional.of(vetDto);
        }
        return vetOpt;

    }

    public void deleteVeterinaria (Long id) {
        veterinariaRepository.deleteById(id);
    }
}
