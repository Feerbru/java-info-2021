package com.informatorio.Carrito.repository;

import com.informatorio.Carrito.entity.DetalleDeCarrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleDeCarritoRepository extends JpaRepository<DetalleDeCarrito, Long> {
}
