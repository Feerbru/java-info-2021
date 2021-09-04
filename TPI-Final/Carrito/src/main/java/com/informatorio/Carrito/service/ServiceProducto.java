package com.informatorio.Carrito.service;

import com.informatorio.Carrito.entity.Producto;
import org.springframework.http.ResponseEntity;

public interface ServiceProducto {

    Producto crearProducto(Producto producto);

    Producto obtenerProductoPorId(Long id);

    ResponseEntity<?> obtenerTodosLosProductos();

    Producto modificarProducto(Long id, Producto producto);

    void eliminarProductoPorId(Long id);

    ResponseEntity<?> obtenerLosProductosPorNombre(String nombre);

    ResponseEntity<?> obtenerLosProductosSinPublicar();

}
