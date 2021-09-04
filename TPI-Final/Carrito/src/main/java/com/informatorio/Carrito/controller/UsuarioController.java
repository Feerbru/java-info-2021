package com.informatorio.Carrito.controller;

import com.informatorio.Carrito.entity.Usuario;
import com.informatorio.Carrito.service.ServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    @Qualifier("servicioUsuario")
    private ServiceUsuario serviceUsuario;

    @PostMapping(value = "/agregar")
    public Usuario crearUsuario(@RequestBody Usuario usuario){
        return serviceUsuario.crearUsuario(usuario);
    }

    @GetMapping(value = "/mostrar/{id}")
    public Usuario obtenerUsuarioPorId(@PathVariable("id") Long id){
        return serviceUsuario.obtenerUsuarioPorId(id);
    }


    @GetMapping(value = "/mostrar")
    public ResponseEntity<?> obtenerTodosLosUsuarios(){
        return serviceUsuario.obtenerTodosLosUsuarios();
    }

    @PutMapping(value = "/editar/{id}")
    public Usuario modificarUsuario(@PathVariable("id") Long id, @Valid @RequestBody Usuario usuario){
        return serviceUsuario.modificarUsuario(id, usuario);
    }

    @DeleteMapping(value = "/eliminar/{id}")
    public void eliminarUsuarioPorId(@PathVariable("id") Long id){
        serviceUsuario.eliminarUsuarioPorId(id);
    }

    //CONSULTA (OBTENER TODOS LOS USUARIOS DE LA CIUDAD DE RESISTENCIA)

    @GetMapping(value = "/mostrar/ciudad/{ciudad}")
    public ResponseEntity<?> obtenerPorCiudad(@PathVariable("ciudad") String ciudad){
        return serviceUsuario.obtenerPorCiudad(ciudad);
    }

    //CONSULTA (OBTENER TODOS LOS USUARIOS QUE FUERON CREADOS LUEGO DE UNA FECHA DADA)

    @GetMapping(value = "/fecha")
    public List<Usuario> obtenerLosUsuariosDespuesDeUnaFechaDada(@RequestParam  @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDateTime fecha){
        return serviceUsuario.obtenerLosUsuariosDespuesDeUnaFechaDada(fecha);
    }

}
