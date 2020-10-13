package com.ejemplo.demo.service;

import com.ejemplo.demo.model.Usuarios;
import com.ejemplo.demo.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosService {

    private final UsuariosRepository usuariosRepository;

    @Autowired
    public UsuariosService(UsuariosRepository usuariosRepository){this.usuariosRepository = usuariosRepository;}

    public Usuarios disableUser(String documento){return usuariosRepository.disableUser(documento);}

    public List<Usuarios> findAllUsersActives(){return usuariosRepository.findAllUsersActives();}

}
