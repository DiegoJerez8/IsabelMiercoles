package com.example.servicio;

import java.util.List;
import com.example.modelo.Producto;

public interface ProductoServicio {

	/**
	 * acciones que quiero que realice , la implementacion se realizará en
	 * ProductoServicioImpl.java
	 * 
	 * @return
	 */

	
	List<Producto> listaProductos();
	void actualizarStock(Producto producto);
	int precioProducto(int codigoProducto);
}
