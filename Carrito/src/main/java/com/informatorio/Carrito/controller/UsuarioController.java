package com.informatorio.Carrito.controller;

import com.informatorio.Carrito.entity.Usuario;
import com.informatorio.Carrito.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @RequestMapping(value = "/usuario" , method = RequestMethod.POST)
    public Usuario crearUsuario(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @RequestMapping(value = "/usuario/{id}" , method = RequestMethod.GET)
    public Usuario obtenerUsuarioPorId(@PathVariable("id") Long id){
        return usuarioRepository.findById(id).get();
    }

    @RequestMapping(value = "/usuario", method = RequestMethod.GET)
    public ResponseEntity<?> obtenerTodosLosUsuarios(){
        return new ResponseEntity<>(usuarioRepository.findAll(), HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/usuario/{id}", method = RequestMethod.PUT)
    public Usuario modificarUsuario(@PathVariable("id") Long id, @Valid @RequestBody Usuario usuario){
        Usuario usuarioExistente = usuarioRepository.findById(id).get();
        usuarioExistente.setNombre(usuario.getNombre());
        usuarioExistente.setApellido(usuario.getApellido());
        usuarioExistente.setDireccion(usuario.getDireccion());
        return usuarioRepository.save(usuarioExistente);
    }

    @RequestMapping(value = "/usuario/{id}" , method = RequestMethod.DELETE)
    public void eliminarUsuarioPorId(@PathVariable("id") Long id){
        usuarioRepository.deleteById(id);
    }
}
