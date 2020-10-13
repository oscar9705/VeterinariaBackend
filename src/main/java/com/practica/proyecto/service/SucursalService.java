package com.practica.proyecto.service;

import com.practica.proyecto.model.Sucursal;

import com.practica.proyecto.repository.SucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SucursalService {


    private final SucursalRepository sucursalRepository;
    @Autowired
    public SucursalService(SucursalRepository sucursalRepository) {
        this.sucursalRepository = sucursalRepository;
    }
    public Sucursal saveSucursal(Sucursal sucursal){
        return sucursalRepository.save(sucursal);
    }

    public Sucursal updateSucursal(Sucursal sucursal){
        return sucursalRepository.save(sucursal);
    }
    public Optional<Sucursal> findById(Long id){
        return sucursalRepository.findById(id);
    }
    public List<Sucursal> findAll(){
        return sucursalRepository.findAll();
    }

    public void deleteSucursal (Long id) {
        sucursalRepository.deleteById(id);
    }
}
