package com.informatorio.demo.controller;

import com.informatorio.demo.entity.EmpleadoJornada;
import com.informatorio.demo.repository.EmpleadoJornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpleadoJornadaController {

    @Autowired
    private EmpleadoJornadaRepository empleadoJornadaRepository;

    @GetMapping(value = "/empleado_jornada")
    public Iterable<EmpleadoJornada> findEmpleadosJornada(){
        return empleadoJornadaRepository.findAll();
    }

}
