package com.informatorio.Carrito.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    private Generado generado;

    @Enumerated(value = EnumType.STRING)
    private Estado estado;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;

    @OneToOne(mappedBy = "carrito", cascade = CascadeType.ALL, orphanRemoval = true)
    private Orden orden;

    @JsonIgnore
    @OneToMany(mappedBy = "carrito", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleDeCarrito> detalleDeCarritos = new ArrayList<>();

    @CreationTimestamp
    private LocalDateTime fechaDeCreacion;

    public Carrito() {
    }

    @Transient
    private BigDecimal total;

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Generado getGenerado() {
        return generado;
    }

    public void setGenerado(Generado generado) {
        this.generado = generado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public List<DetalleDeCarrito> getDetalleDeCarritos() {
        return detalleDeCarritos;
    }

    public void setDetalleDeCarritos(List<DetalleDeCarrito> detalleDeCarritos) {
        this.detalleDeCarritos = detalleDeCarritos;
    }

    public LocalDateTime getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(LocalDateTime fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }


    public void agregarDetalle(DetalleDeCarrito detalleDeCarrito){
        detalleDeCarritos.add(detalleDeCarrito);
        detalleDeCarrito.setCarrito(this);
    }

    public void removerDetalle(DetalleDeCarrito detalleDeCarrito){
        detalleDeCarritos.remove(detalleDeCarrito);
        detalleDeCarrito.setCarrito(null);
    }
}
