package com.informatorio.demo.controller;

import com.informatorio.demo.entity.EmpleadoContratado;
import com.informatorio.demo.repository.EmpleadoContratadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpleadoContratadoController {

    @Autowired
    private EmpleadoContratadoRepository empleadoContratadoRepository;

    @GetMapping(value = "/empleado_contratado")
    public Iterable<EmpleadoContratado> findEmpleados(){
        return empleadoContratadoRepository.findAll();
    }
}
