package com.GS.ControleMissaoEspacial.controller;

import com.GS.ControleMissaoEspacial.model.SistemaMonitorado;
import com.GS.ControleMissaoEspacial.service.SistemaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/sistemas")
public class SistemaController {

    private final SistemaService service;

    public SistemaController(SistemaService service) {
        this.service = service;
    }

    @PostMapping
    public SistemaMonitorado salvar(@RequestBody SistemaMonitorado sistema) {
        return service.salvar(sistema);
    }

    @GetMapping
    public List<SistemaMonitorado> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public SistemaMonitorado buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }
}
