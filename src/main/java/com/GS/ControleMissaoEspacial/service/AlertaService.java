package com.GS.ControleMissaoEspacial.service;

import com.GS.ControleMissaoEspacial.model.Alerta;
import com.GS.ControleMissaoEspacial.repository.AlertaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertaService {

    private final AlertaRepository repository;

    public AlertaService(AlertaRepository repository) {
        this.repository = repository;
    }

    public Alerta salvar(Alerta alerta) {
        return repository.save(alerta);
    }

    public List<Alerta> listarTodos() {
        return repository.findAll();
    }

    public Alerta buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
}