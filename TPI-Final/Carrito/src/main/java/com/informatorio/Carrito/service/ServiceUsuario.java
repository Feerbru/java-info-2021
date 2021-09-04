package com.informatorio.Carrito.service;

import com.informatorio.Carrito.entity.Usuario;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


public interface ServiceUsuario {

    Usuario crearUsuario(Usuario usuario);

    Usuario obtenerUsuarioPorId(Long id);

    ResponseEntity<?> obtenerTodosLosUsuarios();

    Usuario modificarUsuario(Long id, Usuario usuario);

    void eliminarUsuarioPorId(Long id);

    ResponseEntity<?> obtenerPorCiudad(String ciudad);

    List<Usuario> obtenerLosUsuariosDespuesDeUnaFechaDada(LocalDateTime fecha);
}
