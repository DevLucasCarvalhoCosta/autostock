package com.autostock.controller;

import com.autostock.entity.Peca;
import com.autostock.service.PecaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pecas")
public class PecaController {

    private final PecaService service;

    public PecaController(PecaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Peca> listar() {
        return service.listar();
    }

    @PostMapping
    public Peca cadastrar(@RequestBody Peca peca) {
        return service.salvar(peca);
    }
}
