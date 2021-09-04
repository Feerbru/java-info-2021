package com.informatorio.Carrito.repository;

import com.informatorio.Carrito.entity.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarritoRepository extends JpaRepository<Carrito, Long> {
    Carrito getById(Long id);
}
