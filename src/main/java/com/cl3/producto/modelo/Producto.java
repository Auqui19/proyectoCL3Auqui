package com.cl3.producto.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_productocl3")
public class Producto {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDPRODUCTOCL3")
    private int idProductoCL3;
	
	@Column(name = "NOMBRECL3")
    private String nombreCL3;
	@Column(name = "PRECIOVENTACL3")
    private double precioVentaCL3;
	@Column(name = "STOCK")
    private int stock;
	@Column(name = "PRECIOCOMPCL3")
    private double precioCompraCL3;
	@Column(name = "ESTADOCL3")
    private String estadoCL3;
	@Column(name = "DESCRIPCL3")
    private String descripCL3; 

    // Constructores, getters y setters

    // Constructor sin argumentos necesario para JPA
    public Producto() {
    }

    // Constructor con argumentos para facilitar la creación de instancias
    public Producto(String nombreCL3, double precioVentaCL3, int stock, double precioCompraCL3, String estadoCL3, String descripCL3) {
        this.nombreCL3 = nombreCL3;
        this.precioVentaCL3 = precioVentaCL3;
        this.stock = stock;
        this.precioCompraCL3 = precioCompraCL3;
        this.estadoCL3 = estadoCL3;
        this.descripCL3 = descripCL3;
    }

    // Getters y setters para todos los campos
    public int getIdProductoCL3() {
        return idProductoCL3;
    }

    public void setIdProductoCL3(int idProductoCL3) {
        this.idProductoCL3 = idProductoCL3;
    }

    public String getNombreCL3() {
        return nombreCL3;
    }

    public void setNombreCL3(String nombreCL3) {
        this.nombreCL3 = nombreCL3;
    }

    public double getPrecioVentaCL3() {
        return precioVentaCL3;
    }

    public void setPrecioVentaCL3(double precioVentaCL3) {
        this.precioVentaCL3 = precioVentaCL3;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecioCompraCL3() {
        return precioCompraCL3;
    }

    public void setPrecioCompraCL3(double precioCompraCL3) {
        this.precioCompraCL3 = precioCompraCL3;
    }

    public String getEstadoCL3() {
        return estadoCL3;
    }

    public void setEstadoCL3(String estadoCL3) {
        this.estadoCL3 = estadoCL3;
    }

    public String getDescripCL3() {
        return descripCL3;
    }

    public void setDescripCL3(String descripCL3) {
        this.descripCL3 = descripCL3;
    }

}
