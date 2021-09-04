package com.informatorio.Carrito.service;

import com.informatorio.Carrito.entity.Orden;
import org.springframework.http.ResponseEntity;

public interface ServiceOrden {

    ResponseEntity<?> obtenerOrdenes();

    Orden obtenerOrdenPorId(Long id);

    Orden crearOrden(Long id, Long idCarrito, Orden orden);

    ResponseEntity<?> cancelarOrden(Long idOrden, Long idUsuario);

    ResponseEntity<?> obtenerOrdenesDeUsuarioPorId(Long id);
}
