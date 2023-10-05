package com.example.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="productos")
public class Producto {
   
    @Id
    private int codigoProducto;
    private String producto;
    private int precioUnitario;
    private int stock;




    
    public Producto(int codigoProducto, String producto, int precioUnitario, int stock) {
        this.codigoProducto = codigoProducto;
        this.producto = producto;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
    }
    public Producto() {
    }
    public int getcodigoProducto() {
        return codigoProducto;
    }
    public void setcodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public int getprecioUnitario() {
        return precioUnitario;
    }
    public void setprecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoProducto;
        result = prime * result + ((producto == null) ? 0 : producto.hashCode());
        result = prime * result + precioUnitario;
        result = prime * result + stock;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Producto other = (Producto) obj;
        if (codigoProducto != other.codigoProducto)
            return false;
        if (producto == null) {
            if (other.producto != null)
                return false;
        } else if (!producto.equals(other.producto))
            return false;
        if (precioUnitario != other.precioUnitario)
            return false;
        if (stock != other.stock)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Producto [codigoProducto=" + codigoProducto + ", producto=" + producto + ", precioUnitario="
                + precioUnitario + ", stock=" + stock + "]";
    }
  
    
}
