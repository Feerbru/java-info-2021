package com.informatorio.Carrito.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nombre;

    @NotBlank(message = "No puede agregar un apellido vacio")
    private String apellido;

    @NotBlank
    private String direccion;

    @Column(unique = true)
    @Email
    private String nombreDeUsuario;

    @CreationTimestamp
    private LocalDateTime fechaDeAlta;

    @UpdateTimestamp
    private LocalDateTime fechaDeActualizacion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public LocalDateTime getFechaDeAlta() {
        return fechaDeAlta;
    }

    public void setFechaDeAlta(LocalDateTime fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

    public LocalDateTime getFechaDeActualizacion() {
        return fechaDeActualizacion;
    }

    public void setFechaDeActualizacion(LocalDateTime fechaDeActualizacion) {
        this.fechaDeActualizacion = fechaDeActualizacion;
    }
}
