package com.informatorio.Carrito.service;

import com.informatorio.Carrito.entity.Carrito;
import com.informatorio.Carrito.entity.Orden;
import com.informatorio.Carrito.entity.Usuario;
import com.informatorio.Carrito.repository.CarritoRepository;
import com.informatorio.Carrito.repository.OrdenRepository;
import com.informatorio.Carrito.repository.UsuarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service("servicioOrden")
public class ServiceOrdenImpl implements ServiceOrden {

    private final CarritoRepository carritoRepository;
    private final UsuarioRepository usuarioRepository;
    private final OrdenRepository ordenRepository;

    public ServiceOrdenImpl(CarritoRepository carritoRepository, UsuarioRepository usuarioRepository , OrdenRepository ordenRepository){
        this.carritoRepository = carritoRepository;
        this.usuarioRepository = usuarioRepository;
        this.ordenRepository =  ordenRepository;
    }

    @Override
    public ResponseEntity<?> obtenerOrdenes() {
        return new ResponseEntity<>(ordenRepository.findAll(), HttpStatus.ACCEPTED);
    }

    @Override
    public Orden obtenerOrdenPorId(Long id) {
        return ordenRepository.findById(id).get();
    }

    @Override
    public Orden crearOrden(Long id, Long idCarrito , Orden orden) {
        Usuario usuario = usuarioRepository.getById(id);
        Carrito carrito = carritoRepository.getById(idCarrito);
        carrito.setOrden(orden);
        orden.setCarrito(carrito);
        //orden.setCantidadDeProducto(carrito.);
        orden.setTotalOrden(carrito.getTotal());
        orden.setNombreDeUsuario(carrito.getUsuario().getNombre());
        return ordenRepository.save(orden);
    }

    @Override
    public ResponseEntity<?> cancelarOrden(Long idOrden, Long idUsuario) {
        return null;
    }

    @Override
    public ResponseEntity<?> obtenerOrdenesDeUsuarioPorId(Long id) {
        return null;
    }
}
