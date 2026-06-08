package com.GS.ControleMissaoEspacial.repository;

import com.GS.ControleMissaoEspacial.model.SistemaMonitorado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SistemaRepository extends JpaRepository<SistemaMonitorado, Long> {
}