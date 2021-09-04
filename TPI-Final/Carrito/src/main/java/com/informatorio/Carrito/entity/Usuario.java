package com.informatorio.Carrito.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.informatorio.Carrito.util.ValidarEmail;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Debes especificar el nombre")
    @Size(min= 1, max = 50, message = "El nombre debe medir entre 1 y 50")
    private String nombre;

    @NotBlank(message = "Debes especificar el apellido")
    @Size(min = 1, max = 50 , message = "El apellido debe medir entre 1 y 50")
    private String apellido;

    @NotBlank(message = "Debes especificar la dirección")
    @Size(min = 1 ,max = 100, message = "La dirección debe medir entre 1 y 100")
    private String direccion;

    @Column(unique = true)
    @Email(regexp = ValidarEmail.EMAIL_REGEX)
    @NotBlank(message = "Debes especificar el email")
    private String email;

    @CreationTimestamp
    private LocalDateTime fechaDeCreacion;

    @NotBlank(message = "Debes especificar la contraseña")
    private String password;

    @NotBlank(message = "Debes especificar la ciudad")
    @Size(min = 1 , max = 50, message = "La ciudad debe medir entra 1 y 50")
    private String ciudad;

    @NotBlank(message = "Debes especificar la provincia")
    @Size(min = 1 , max = 50, message = "La provincia debe medir entra 1 y 50")
    private String provincia;

    @NotBlank(message = "Debes especificar el país")
    @Size(min = 1 , max = 50, message = "El país debe medir entra 1 y 50")
    private String pais;


    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Carrito> carritos = new ArrayList<>();


    //@OneToMany(mappedBy = "usuario" , cascade = CascadeType.ALL, orphanRemoval = true)
    //private List<Orden> ordenes = new ArrayList<>();

    public Usuario() {
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(LocalDateTime fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    /*public List<Orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(List<Orden> ordenes) {
        this.ordenes = ordenes;
    }
*/
    public List<Carrito> getCarritos() {
        return carritos;
    }

    public void setCarritos(List<Carrito> carritos) {
        this.carritos = carritos;
    }

    //Metodos utilitarios

    public void agregarCarrito(Carrito carrito){
        carritos.add(carrito);
        carrito.setUsuario(this);
    }

    public void removerCarrito(Carrito carrito){
        carritos.add(carrito);
        carrito.setUsuario(null);
    }
}
