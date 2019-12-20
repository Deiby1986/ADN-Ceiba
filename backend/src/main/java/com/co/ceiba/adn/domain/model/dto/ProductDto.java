package com.co.ceiba.adn.domain.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
	
	private Long id;
	private String codigo;
	private String nombre;
	private Double price;
	private Long qty;	
	
	public ProductDto(Long id, String codigo, String nombre,Double price, Long qty) {
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.price = price;
		this.qty = qty;
	}

	
	

}
