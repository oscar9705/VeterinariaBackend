package com.practica.proyecto.service;

import com.practica.proyecto.model.Mascota;
import com.practica.proyecto.model.Usuario;
import com.practica.proyecto.repository.MascotaRepository;
import com.practica.proyecto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService {

    private final MascotaRepository mascotaRepository;
    @Autowired
    public MascotaService(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }

    public Mascota saveMascota(Mascota mascota){
        return mascotaRepository.save(mascota);
    }

    public void deleteMascota (Long id_mascota) {mascotaRepository.deleteById(id_mascota);}

    public int disableUser(String nombre_mascota){return mascotaRepository.disableMascota(nombre_mascota);}


}
