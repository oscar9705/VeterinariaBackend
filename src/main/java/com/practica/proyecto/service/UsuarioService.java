package com.practica.proyecto.service;

import com.practica.proyecto.model.Usuario;
import com.practica.proyecto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario saveUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Usuario updateusuario(Usuario usuario){
        return usuarioRepository.save( usuario);
    }

    public Optional<Usuario> findById(Long id){
        return usuarioRepository.findById(id);
    }

    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    public void deleteSucursal (Long id) {usuarioRepository.deleteById(id);}

    public Usuario disableUser(String documento){return usuarioRepository.disableUser(documento);}

    public List<Usuario> findAllUsersActives(){return usuarioRepository.findAllUsersActives();}
}
