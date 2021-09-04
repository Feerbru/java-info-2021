package com.informatorio.Carrito.controller;

import com.informatorio.Carrito.dto.OperacionCarrito;
import com.informatorio.Carrito.entity.Carrito;
import com.informatorio.Carrito.service.ServiceCarrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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
    @GetMapping(value = "/carrito/mostrar")
    public List<Carrito> obtenerCarritos(){
        return serviceCarrito.obtenerCarritos();
    }

    @GetMapping(value = "/carrito/{id}")
    public ResponseEntity<?> obtenerCarritoPorId(@PathVariable("id") Long id){
        return serviceCarrito.obtenerCarritoPorId(id);
    }

    @PostMapping(value = "/usuario/{id}/carrito/{idCarrito}")
    public ResponseEntity<?> agregarProducto(@PathVariable("id") Long idUsuario,
                                             @PathVariable("idCarrito") Long idCarrito,
                                             @RequestBody OperacionCarrito operacionCarrito){
        return serviceCarrito.agregarProducto(idUsuario,idCarrito,operacionCarrito);
    }

    @PutMapping(value = "/carrito/{id_carrito}/estado")
    public ResponseEntity<?> cerrarCarrito(@PathVariable("id_carrito") Long idCarrito){
        return serviceCarrito.cerrarCarrito(idCarrito);
    }
}
