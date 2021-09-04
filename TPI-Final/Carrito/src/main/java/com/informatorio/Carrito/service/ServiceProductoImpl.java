package com.informatorio.Carrito.service;

import com.informatorio.Carrito.entity.Producto;
import com.informatorio.Carrito.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("servicioProducto")
public class ServiceProductoImpl implements ServiceProducto{

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto obtenerProductoPorId(Long id) {
        return productoRepository.findById(id).get();
    }

    @Override
    public ResponseEntity<?> obtenerTodosLosProductos() {
        return new ResponseEntity<>(productoRepository.findAll(), HttpStatus.ACCEPTED);
    }

    @Override
    public Producto modificarProducto(Long id, Producto producto) {
        Producto productoExistente = productoRepository.findById(id).get();
        productoExistente.setNombre(producto.getNombre());
        return productoRepository.save(productoExistente);
    }

    @Override
    public void eliminarProductoPorId(Long id) {
        productoRepository.deleteById(id);
    }

    @Override
    public ResponseEntity<?> obtenerLosProductosPorNombre(String nombre) {
        return new ResponseEntity<>(productoRepository.findByName(nombre) , HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> obtenerLosProductosSinPublicar() {

        List<Producto> productos = new ArrayList<>();
        for (Producto p : productoRepository.findAll()){
            if (!p.isPublicado()){
                productos.add(p);
            }
        }
        return new ResponseEntity<>(productos, HttpStatus.OK);
    }
}
