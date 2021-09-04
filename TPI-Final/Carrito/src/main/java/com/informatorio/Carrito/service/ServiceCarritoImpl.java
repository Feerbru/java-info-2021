package com.informatorio.Carrito.service;

import com.informatorio.Carrito.dto.OperacionCarrito;
import com.informatorio.Carrito.entity.Carrito;
import com.informatorio.Carrito.entity.DetalleDeCarrito;
import com.informatorio.Carrito.entity.Producto;
import com.informatorio.Carrito.entity.Usuario;
import com.informatorio.Carrito.repository.CarritoRepository;
import com.informatorio.Carrito.repository.ProductoRepository;
import com.informatorio.Carrito.repository.UsuarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service("servicioCarrito")
public class ServiceCarritoImpl implements ServiceCarrito{

    private final CarritoRepository carritoRepository;
    private final UsuarioRepository usuarioRepository;
    private final ProductoRepository productoRepository;

    public ServiceCarritoImpl(CarritoRepository carritoRepository, UsuarioRepository usuarioRepository , ProductoRepository productoRepository){
        this.carritoRepository = carritoRepository;
        this.usuarioRepository = usuarioRepository;
        this.productoRepository = productoRepository;
    }

    @Override
    public ResponseEntity<?> crearCarrito(Long userId, Carrito carrito) {
        Usuario usuario =usuarioRepository.getById(userId);
        carrito.setUsuario(usuario);
        return new ResponseEntity<>(carritoRepository.save(carrito), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> obtenerCarritos() {
        return new ResponseEntity<>(carritoRepository.findAll(), HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<?> obtenerCarritoPorId(Long id) {
        return new ResponseEntity<>(carritoRepository.getById(id), HttpStatus.OK);
    }

    @Override
    public Carrito editarCarrito(Long carritoId, Carrito carrito) {
        Carrito carritoExistente = carritoRepository.getById(carritoId);
        carritoExistente.setGenerado(carrito.getGenerado());
        carritoExistente.setEstado(carrito.getEstado());
        carritoExistente.setTotal(carrito.getTotal());
        return carritoRepository.save(carritoExistente);
    }

    @Override
    public ResponseEntity<?> agregarProducto(Long idCarrito, OperacionCarrito operacionCarrito) {
        Carrito carrito = carritoRepository.getById(idCarrito);
        Producto producto = productoRepository.getById(operacionCarrito.getProductoId());
        DetalleDeCarrito detalleDeCarrito = new DetalleDeCarrito();
        detalleDeCarrito.setCarrito(carrito);
        detalleDeCarrito.setProducto(producto);
        detalleDeCarrito.setCantidad(operacionCarrito.getCantidad());
        carrito.agregarDetalle(detalleDeCarrito);
        return new ResponseEntity<>(carritoRepository.save(carrito), HttpStatus.CREATED);
    }
}
