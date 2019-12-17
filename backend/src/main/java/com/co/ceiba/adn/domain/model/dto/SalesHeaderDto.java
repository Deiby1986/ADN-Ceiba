package com.co.ceiba.adn.domain.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SalesHeaderDto {
	
	private Long id;
	private String nombreCliente;
	private String fecha;	
	private Double total;
	
	public SalesHeaderDto() {		
	}

	public SalesHeaderDto(Long id, String nombreCliente, String fecha, Double total) {
		this.id = id;
		this.nombreCliente = nombreCliente;
		this.fecha = fecha;
		this.total = total;
	}
	
	

}
