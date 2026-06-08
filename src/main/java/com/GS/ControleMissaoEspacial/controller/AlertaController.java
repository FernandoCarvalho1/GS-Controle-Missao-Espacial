package com.GS.ControleMissaoEspacial.controller;

import com.GS.ControleMissaoEspacial.model.Alerta;
import com.GS.ControleMissaoEspacial.service.AlertaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/alertas")
public class AlertaController {

    private final AlertaService service;

    public AlertaController(AlertaService service) {
        this.service = service;
    }

    @PostMapping
    public Alerta salvar(@RequestBody Alerta alerta) {
        return service.salvar(alerta);
    }

    @GetMapping
    public List<Alerta> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Alerta buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }
}
