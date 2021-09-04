package com.informatorio.Carrito.controller;

import com.informatorio.Carrito.entity.Orden;
import com.informatorio.Carrito.service.ServiceOrden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrdenController {

    @Autowired
    @Qualifier("servicioOrden")
    private ServiceOrden serviceOrden;

    @GetMapping(value = "/ordenes")
    public ResponseEntity<?> obtenerOrdenes(){
        return serviceOrden.obtenerOrdenes();
    }

    @GetMapping(value = "/orden/{id}")
    public Orden obtenerOrdenPorId(@PathVariable("id") Long id){
        return serviceOrden.obtenerOrdenPorId(id);
    }

    @PostMapping(value = "usuario/{id}/carrito/{id_carrito}/orden")
    public Orden crearOrden(@PathVariable("id") Long idUsuario,
                            @PathVariable("id_carrito") Long id_carrito,
                            @RequestBody Orden orden){
        return serviceOrden.crearOrden(idUsuario,id_carrito,orden);
    }
}
