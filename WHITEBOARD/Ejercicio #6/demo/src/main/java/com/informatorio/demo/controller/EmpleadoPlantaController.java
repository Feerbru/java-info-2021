package com.informatorio.demo.controller;

import com.informatorio.demo.entity.EmpleadoPlanta;
import com.informatorio.demo.repository.EmpleadoPlantaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpleadoPlantaController {

    @Autowired
    private EmpleadoPlantaRepository empleadoPlantaRepository;

    @GetMapping(value = "/empleado_planta")
    public Iterable<EmpleadoPlanta> findEmpleadoPlanta(){
        return empleadoPlantaRepository.findAll();
    }
}
