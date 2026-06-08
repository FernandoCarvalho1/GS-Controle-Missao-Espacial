package com.GS.ControleMissaoEspacial.repository;

import com.GS.ControleMissaoEspacial.model.Alerta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertaRepository extends JpaRepository<Alerta, Long> {
}