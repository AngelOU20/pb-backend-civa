package com.api.futbolista.controllers;

import com.api.futbolista.models.Futbolista;
import com.api.futbolista.services.FutbolistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/futbolista")
public class FutbolistaController {
    private final FutbolistaService futbolistaService;

    @Autowired
    public FutbolistaController(FutbolistaService futbolistaService) {
        this.futbolistaService = futbolistaService;
    }

    @GetMapping(value = "/")
    public List<Futbolista> obtenerFubolistas() {
        return futbolistaService.obtenerTodosFutbolistas();
    }

    @GetMapping(value = "/{id}")
    public Optional<Futbolista> obtenerFutbolistaPorId(@PathVariable Long id) {
        return futbolistaService.obtenerFutbolistaPorId(id);
    }
}
