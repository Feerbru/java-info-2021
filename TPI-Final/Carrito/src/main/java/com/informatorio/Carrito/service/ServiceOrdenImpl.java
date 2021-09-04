package com.informatorio.Carrito.service;

import com.informatorio.Carrito.entity.Carrito;
import com.informatorio.Carrito.entity.Orden;
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
    public ResponseEntity<?> crearOrden(Long id, Orden orden) {
        Carrito carrito = carritoRepository.findById(id).get();
        orden.setCarrito(carrito.getOrden().getCarrito());
        orden.setEstado(carrito.getEstado());
        return null;
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
