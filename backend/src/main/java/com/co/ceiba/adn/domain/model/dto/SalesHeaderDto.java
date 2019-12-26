package com.co.ceiba.adn.domain.model.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SalesHeaderDto {
	
	private Long id;
	private String nombreCliente;
	private String fecha;	
	private Double total;
	
	private List<SalesDetailDto> details;
	

	public SalesHeaderDto(Long id, String nombreCliente, String fecha, Double total) {
		this.id = id;
		this.nombreCliente = nombreCliente;
		this.fecha = fecha;
		this.total = total;
	}


	public SalesHeaderDto(Long id, String nombreCliente, String fecha, Double total, List<SalesDetailDto> details) {
		this.id = id;
		this.nombreCliente = nombreCliente;
		this.fecha = fecha;
		this.total = total;
		this.details = new ArrayList<>(details);
	}
	
	
	
	
	
}
