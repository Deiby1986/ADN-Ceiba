package com.co.ceiba.adn.domain.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
	
	private Long id;
	private String codigo;
	private String nombre;
	private Long qty;
	
	
	public ProductDto(Long id, String codigo, String nombre, Long qty) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.qty = qty;
	}
	
	

}
