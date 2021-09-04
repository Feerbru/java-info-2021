package com.informatorio.Carrito.service;

import com.informatorio.Carrito.dto.OperacionCarrito;
import com.informatorio.Carrito.entity.Carrito;
import org.springframework.http.ResponseEntity;


public interface ServiceCarrito {

    ResponseEntity<?> crearCarrito(Long userId, Carrito carrito);

    ResponseEntity<?> obtenerCarritos();

    ResponseEntity<?> obtenerCarritoPorId(Long id);

    Carrito editarCarrito(Long carritoId, Carrito carrito);

    ResponseEntity<?> agregarProducto(Long idUsuario ,Long idCarrito, OperacionCarrito operacionCarrito);

    ResponseEntity<?> cerrarCarrito(Long id_carrito);
}
