package com.api.futbolista.services;

import com.api.futbolista.models.Futbolista;
import com.api.futbolista.repositories.IFutbolistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FutbolistaService {
    private final IFutbolistaRepository futbolistaRepository;

    @Autowired
    public FutbolistaService(IFutbolistaRepository futbolistaRepository) {
        this.futbolistaRepository = futbolistaRepository;
    }

    // Métodos
    public void crearFutbolista(Futbolista futbolista){
        futbolistaRepository.save(futbolista);
    }

    public List<Futbolista> obtenerTodosFutbolistas() {
        return futbolistaRepository.findAll();
    }

    public Optional<Futbolista> obtenerFutbolistaPorId(Long id) {
        return futbolistaRepository.findById(id);
    }

    public void eliminarFutbolista(Long id) {
        futbolistaRepository.deleteById(id);
    }
}
