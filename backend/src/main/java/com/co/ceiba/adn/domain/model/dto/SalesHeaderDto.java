package com.co.ceiba.adn.domain.model.dto;

import lombok.Getter;
import lombok.Setter;


public class SalesHeaderDto {
	
	private Long id;
	private String nombreCliente;
	private String fecha;	
	private Double total;
	

	public SalesHeaderDto(Long id, String nombreCliente, String fecha, Double total) {
		this.id = id;
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
