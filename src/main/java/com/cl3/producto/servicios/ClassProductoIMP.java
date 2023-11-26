package com.cl3.producto.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cl3.producto.modelo.Producto;
import com.cl3.producto.repositorio.IProducto;

@Service
public class ClassProductoIMP implements IProductoServicio {

	@Autowired
	private IProducto iproductopository;
	
	@Override
	public List<Producto> ListadoProductos() {
		return (List<Producto>) iproductopository.findAll();
	}

	@Override
	public void RegistrarProducto(Producto producto) {
		iproductopository.save(producto);
	}

	@Override
	public Producto BuscarPorID(Integer id) {
		return iproductopository.findById(id).orElse(null);
	}

	@Override
	public void EliminarProducto(Integer id) {
		iproductopository.deleteById(id);
	}

	@Override
	public void ActualizarProducto(Producto producto) {
		Producto productoExistente = iproductopository.findById(producto.getIdProductoCL3()).orElse(null);
		if (productoExistente != null) {
	        productoExistente.setNombreCL3(producto.getNombreCL3());
	        productoExistente.setPrecioVentaCL3(producto.getPrecioVentaCL3());
	        productoExistente.setStock(producto.getStock());
	        productoExistente.setPrecioCompraCL3(producto.getPrecioCompraCL3());
	        productoExistente.setEstadoCL3(producto.getEstadoCL3());
	        productoExistente.setDescripCL3(producto.getDescripCL3());

	        iproductopository.save(productoExistente);
	    } else {
	        throw new RuntimeException("No se puede actualizar. El producto no existe.");
	    }
	}

}
