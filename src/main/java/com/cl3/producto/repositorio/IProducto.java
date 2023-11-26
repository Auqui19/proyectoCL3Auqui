package com.cl3.producto.repositorio;

import org.springframework.data.repository.CrudRepository;
import com.cl3.producto.modelo.Producto;

public interface IProducto extends CrudRepository<Producto, Integer> {

}
