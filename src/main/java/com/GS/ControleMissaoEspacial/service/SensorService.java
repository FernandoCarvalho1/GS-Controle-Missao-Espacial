package com.GS.ControleMissaoEspacial.service;

import com.GS.ControleMissaoEspacial.model.Sensor;
import com.GS.ControleMissaoEspacial.repository.SensorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorService {

    private final SensorRepository repository;

    public SensorService(SensorRepository repository) {
        this.repository = repository;
    }

    public Sensor salvar(Sensor sensor) {
        return repository.save(sensor);
    }

    public List<Sensor> listarTodos() {
        return repository.findAll();
    }

    public Sensor buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {repository.deleteById(id);
    }
}