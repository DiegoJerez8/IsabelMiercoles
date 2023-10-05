package com.example.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.modelo.Producto;
import com.example.dao.ProductoDao;

@Service
public class ProductoServicioImpl implements ProductoServicio {
    @Autowired
    ProductoDao dao;
    @Override
    public List<Producto> listaProductos() {
       return dao.findAll();
    }

    @Override
    public void actualizarStock(Producto producto) {
        dao.save(producto);
        
    }

    @Override
    public int precioProducto(int codigoProducto) {
    Producto producto = dao.findById(codigoProducto).orElseThrow(()->new IllegalArgumentException("no se ha encontrado ningun producto con esa id"));
    return producto.getprecioUnitario();
    }
}
