package com.informatorio.Carrito.service;

import com.informatorio.Carrito.entity.Producto;
import com.informatorio.Carrito.entity.Usuario;
import com.informatorio.Carrito.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("servicioUsuario")
public class ServiceUsuarioImpl implements ServiceUsuario {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario obtenerUsuarioPorId(Long id) {
        return usuarioRepository.findById(id).get();
    }

    @Override
    public ResponseEntity<?> obtenerTodosLosUsuarios() {
        return new ResponseEntity<>(usuarioRepository.findAll(), HttpStatus.ACCEPTED);
    }

    @Override
    public Usuario modificarUsuario(Long id, Usuario usuario) {
        Usuario usuarioExistente = usuarioRepository.findById(id).get();
        usuarioExistente.setNombre(usuario.getNombre());
        usuarioExistente.setApellido(usuario.getApellido());
        usuarioExistente.setDireccion(usuario.getDireccion());
        return usuarioRepository.save(usuarioExistente);
    }

    @Override
    public void eliminarUsuarioPorId(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public ResponseEntity<?> obtenerPorCiudad(String ciudad) {

        List<Usuario> usuarios = new ArrayList<>();
        for (Usuario p : usuarioRepository.findAll()){
            if (ciudad.equals(p.getCiudad())){
                usuarios.add(p);
            }
        }
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    @Override
    public List<Usuario> obtenerLosUsuariosDespuesDeUnaFechaDada(LocalDateTime fecha){
        return usuarioRepository.getByFechaDeCreacion(fecha);
    }


}
