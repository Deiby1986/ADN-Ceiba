package com.co.ceiba.adn.domain.builder;

import com.co.ceiba.adn.domain.model.dto.ProductDto;
import com.co.ceiba.adn.domain.model.entities.Product;

public class ProductDtoTestDataBuilder {
	private Long id;
	private String codigo;
	private String nombre;
	private Long qty;
	private Double price;
	
	public ProductDtoTestDataBuilder() {
		this.id = 1L;
		this.codigo = "PR001";
		this.nombre = "Producto Prueba";
		this.qty = 100L;
		this.price = 200D;
	}
	
	public ProductDtoTestDataBuilder withCode(String code) {
		this.codigo = code;
		return this;		
	}
	
	public ProductDtoTestDataBuilder withName(String name) {
		this.nombre = name;
		return this;		
	}
	
	public ProductDtoTestDataBuilder withQty(Long qty) {
		this.qty = qty;
		return this;		
	}
	
	public ProductDto build() {
		return new ProductDto(id,codigo,nombre,this.price,qty);
	}

	
	
}
