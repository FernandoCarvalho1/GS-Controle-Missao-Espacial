package com.GS.ControleMissaoEspacial.repository;

import com.GS.ControleMissaoEspacial.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<Sensor, Long> {
}