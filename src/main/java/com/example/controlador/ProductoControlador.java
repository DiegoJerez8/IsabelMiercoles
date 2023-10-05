package com.example.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.modelo.Producto;
import com.example.servicio.ProductoServicio;

@RestController
public class ProductoControlador {
    @Autowired
    ProductoServicio servicio;

    @GetMapping(value = "productos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Producto> listarProductosActual() {
        return servicio.listaProductos();
    }

     @GetMapping(value = "productos/precio/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public int productoPrecio(@PathVariable("codigo") int codigoProducto) {

        return servicio.precioProducto(codigoProducto);
    }
}
