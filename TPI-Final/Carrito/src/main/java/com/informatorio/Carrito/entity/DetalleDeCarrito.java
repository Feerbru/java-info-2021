package com.informatorio.Carrito.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class DetalleDeCarrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Transient
    private BigDecimal subtotal;

    private Integer cantidad;

    @ManyToOne(fetch = FetchType.LAZY)
    Producto producto;

    @ManyToOne(fetch = FetchType.LAZY)
    Carrito carrito;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getSubtotal() {
        return producto.getPrecioUnitario().multiply(BigDecimal.valueOf(cantidad));
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public DetalleDeCarrito() {
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }


    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
}
