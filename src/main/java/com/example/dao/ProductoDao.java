package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.modelo.Producto;


public interface ProductoDao extends JpaRepository<Producto, Integer> {

	
}
