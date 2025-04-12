package com.autostock.service;

import com.autostock.entity.Peca;
import com.autostock.repository.PecaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PecaService {

    private final PecaRepository repository;

    public PecaService(PecaRepository repository) {
        this.repository = repository;
    }

    public List<Peca> listar() {
        return repository.findAll();
    }

    public Peca salvar(Peca peca) {
        return repository.save(peca);
    }
}
