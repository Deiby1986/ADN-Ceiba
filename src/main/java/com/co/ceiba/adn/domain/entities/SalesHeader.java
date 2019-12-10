package com.co.ceiba.adn.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SalesHeader")
public class SalesHeader {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre_cliente", nullable = false)
	private String nombreCliente;
	@Column(name = "fecha", nullable = false)
	private String fecha;
	@Column(name = "total", nullable = false)
	private Double total;
	
	
	public SalesHeader(String nombreCliente, String fecha, Double total) {
		super();
		this.nombreCliente = nombreCliente;
		this.fecha = fecha;
		this.total = total;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombreCliente() {
		return nombreCliente;
	}


	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public Double getTotal() {
		return total;
	}


	public void setTotal(Double total) {
		this.total = total;
	}
	
	
	
	
	
	
	

}
