package com.co.ceiba.adn.domain.builder;

import com.co.ceiba.adn.domain.model.entities.Product;

public class ProductTestDataBuilder {
	private Long id;
	private String codigo;
	private String nombre;
	private Long qty;
	private Double price;
	
	public ProductTestDataBuilder() {
		super();
		this.id = 0L;
		this.codigo = "PR001";
		this.nombre = "Producto Prueba";
		this.qty = 100L;
		this.price = 200D;
	}
	
	public ProductTestDataBuilder withCode(String code) {
		this.codigo = code;
		return this;		
	}
	
	public ProductTestDataBuilder withName(String name) {
		this.nombre = name;
		return this;		
	}
	
	public ProductTestDataBuilder withQty(Long qty) {
		this.qty = qty;
		return this;		
	}
	
	public ProductTestDataBuilder withId(Long id) {
		this.id = id;
		return this;		
	} 
	
	public Product build() {
		return new Product(id,codigo,nombre,qty,this.price);
	}

	
	
}
