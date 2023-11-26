package com.cl3.producto.servicios;

import java.util.List;
import com.cl3.producto.modelo.Producto;

public interface IProductoServicio {
	public List<Producto> ListadoProductos();
	public void RegistrarProducto(Producto producto);
	public Producto BuscarPorID(Integer id);
	public void EliminarProducto(Integer id);
	public void ActualizarProducto(Producto producto);
}
