package com.GS.ControleMissaoEspacial.service;

import com.GS.ControleMissaoEspacial.model.SistemaMonitorado;
import com.GS.ControleMissaoEspacial.repository.SistemaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SistemaService {

    private final SistemaRepository repository;

    public SistemaService(SistemaRepository repository) {
        this.repository = repository;
    }

    public SistemaMonitorado salvar(SistemaMonitorado sistema) {
        return repository.save(sistema);
    }

    public List<SistemaMonitorado> listarTodos() {
        return repository.findAll();
    }

    public SistemaMonitorado buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
}