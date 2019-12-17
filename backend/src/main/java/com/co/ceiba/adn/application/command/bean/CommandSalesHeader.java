package com.co.ceiba.adn.application.command.bean;

import java.util.ArrayList;
import java.util.List;

public class CommandSalesHeader {
	
	private Long id;
	private String nombreCliente;
	private String fecha;	
	private Double total;
	
	private List<CommandSalesDetail> detalles;
	
	public CommandSalesHeader() {
		
	}
	
	

	public CommandSalesHeader(Long id, String nombreCliente, String fecha, Double total,
			List<CommandSalesDetail> detalles) {
		super();
		this.id = id;
		this.nombreCliente = nombreCliente;
		this.fecha = fecha;
		this.total = total;
		this.detalles = new ArrayList<>();
		if(detalles!=null)
			this.detalles.addAll(detalles);
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



	public List<CommandSalesDetail> getDetalles() {
		return detalles;
	}



	public void setDetalles(List<CommandSalesDetail> detalles) {
		this.detalles = detalles;
	}
	
	
	
	
	

}
