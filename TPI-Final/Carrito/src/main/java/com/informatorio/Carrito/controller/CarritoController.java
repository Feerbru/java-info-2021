package com.informatorio.Carrito.controller;

import com.informatorio.Carrito.dto.OperacionCarrito;
import com.informatorio.Carrito.entity.Carrito;
import com.informatorio.Carrito.service.ServiceCarrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class CarritoController {

    @Autowired
    @Qualifier("servicioCarrito")
    private ServiceCarrito serviceCarrito;

    @PostMapping(value = "usuario/{id}/carrito")
    public ResponseEntity<?> crearCarrito(@PathVariable("id") Long userId, @Valid @RequestBody Carrito carrito){
        return serviceCarrito.crearCarrito(userId,carrito);
    }

    @PutMapping(value = "/carrito/editar/{carritoId}")
    public Carrito editarCarrito(@PathVariable("carritoId") Long carritoId,@Valid @RequestBody Carrito carrito){
        return serviceCarrito.editarCarrito(carritoId,carrito);
    }
    @GetMapping(value = "/carrito")
    public ResponseEntity<?> obtenerCarritos(){
        return serviceCarrito.obtenerCarritos();
    }

    @GetMapping(value = "/carrito/{id}")
    public ResponseEntity<?> obtenerCarritoPorId(@PathVariable("id") Long id){
        return serviceCarrito.obtenerCarritoPorId(id);
    }

    @PostMapping(value = "/carrito/{idCarrito}")
    public ResponseEntity<?> agregarProducto(@PathVariable("idCarrito") Long idCarrito,
                                             @Valid @RequestBody OperacionCarrito operacionCarrito){
        return serviceCarrito.agregarProducto(idCarrito,operacionCarrito);
    }
}
