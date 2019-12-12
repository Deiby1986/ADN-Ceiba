package com.co.ceiba.adn.application.command.bean;

import java.util.List;

public class CommandSalesHeader {
	
	private Long id;
	private String nombreCliente;
	private String fecha;	
	private Double total;
	
	private List<CommandSalesDetail> detalles;

	public CommandSalesHeader(Long id, String nombreCliente, String fecha, Double total,
			List<CommandSalesDetail> detalles) {
		super();
		this.id = id;
		this.nombreCliente = nombreCliente;
		this.fecha = fecha;
		this.total = total;
		this.detalles = detalles;
	}
	
	

}
