package com.informatorio.Carrito.controller;

import com.informatorio.Carrito.entity.Producto;
import com.informatorio.Carrito.service.ServiceProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/producto")
public class ProductoController {

    @Autowired
    @Qualifier("servicioProducto")
    private ServiceProducto serviceProducto;

    @PostMapping(value = "/agregar")
    public Producto crearProducto(@RequestBody Producto producto){
        return serviceProducto.crearProducto(producto);
    }

    @GetMapping(value = "/mostrar/{id}")
    public Producto obtenerProductoPorId(@PathVariable("id") Long id){
        return serviceProducto.obtenerProductoPorId(id);
    }


    @GetMapping(value = "/mostrar")
    public ResponseEntity<?> obtenerTodosLosProductos(){
        return serviceProducto.obtenerTodosLosProductos();
    }

    @PutMapping(value = "/editar/{id}")
    public Producto modificarProducto(@PathVariable("id") Long id, @Valid @RequestBody Producto producto){
        return serviceProducto.modificarProducto(id, producto);
    }

    @DeleteMapping(value = "/eliminar/{id}")
    public void eliminarProductoPorId(@PathVariable("id") Long id){
        serviceProducto.eliminarProductoPorId(id);
    }

    @GetMapping(value = "/mostrar/no_publicado")
    public ResponseEntity<?> obtenerLosProductosSinPublicar(){
        return serviceProducto.obtenerLosProductosSinPublicar();
    }

    @GetMapping(value = "/mostrar/nombre/{palabra}")
    public ResponseEntity<?> obtenerLosProductosPorNombre(@PathVariable("palabra") String  palabra){
        return serviceProducto.obtenerLosProductosPorNombre(palabra);
    }
}
