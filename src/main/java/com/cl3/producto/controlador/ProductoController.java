package com.cl3.producto.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cl3.producto.modelo.Producto;
import com.cl3.producto.servicios.IProductoServicio;

@Controller
public class ProductoController {

	@Autowired
	private IProductoServicio iproductoservicio;
	
	@GetMapping("/ListadoProductos")
	public String ListadoProducto(Model modelo) {
		List<Producto> listar= iproductoservicio.ListadoProductos();
		System.out.println(listar); // Imprime la lista en la consola
		modelo.addAttribute("listadoproductos",listar);
		return "producto/listado_producto";
	}
	
	@GetMapping("/RegisProducto")
	public String RegistrarProducto(Model modelo) {
		Producto clproducto = new Producto();
		modelo.addAttribute("regproducto",clproducto);
		return "producto/registrar_producto";
	}
	
	@PostMapping("/GuardarProducto")
    public String GuardarAuto(@ModelAttribute Producto clproducto) {
		iproductoservicio.RegistrarProducto(clproducto);
        return "redirect:/ListadoProductos";
    }
	
	@GetMapping("/Editar/{id}")
	public String Editar(@PathVariable("id") Integer idproducto, Model modelo) {
	    Producto buspro = iproductoservicio.BuscarPorID(idproducto);
	    modelo.addAttribute("editproducto", buspro);
	    return "producto/editar_producto";
	}
	
	@PostMapping("/ActualizarProducto")
	public String Actualizar(@ModelAttribute Producto clproducto) {
	    iproductoservicio.ActualizarProducto(clproducto);
	    return "redirect:/ListadoProductos";
	}
	
	@GetMapping("/Eliminar/{id}")
	public String Eliminar(@PathVariable("id") Integer idproducto, Model modelo) {
		iproductoservicio.EliminarProducto(idproducto);
		List<Producto> listado = iproductoservicio.ListadoProductos();
		modelo.addAttribute("listadoproductos", listado);
		return "producto/listado_producto";
	}
}
