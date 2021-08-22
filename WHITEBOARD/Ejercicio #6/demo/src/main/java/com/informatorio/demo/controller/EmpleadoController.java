package com.informatorio.demo.controller;

import com.informatorio.demo.entity.Empleado;
import com.informatorio.demo.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpleadoController {

    @Autowired
    private EmpleadoRepository repository;

    //@RequestMapping(value= "/empleado", method = RequestMethod.GET)
    @GetMapping(value= "/empleado")
    public Iterable<Empleado> findEmpleados(){
        return repository.findAll();
    }
}
