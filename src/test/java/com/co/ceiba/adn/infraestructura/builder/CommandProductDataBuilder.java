package com.co.ceiba.adn.infraestructura.builder;

import com.co.ceiba.adn.application.command.bean.CommandProduct;

public class CommandProductDataBuilder {
	
	private String code;
	private String name;
	private Long qty;
	
	public CommandProductDataBuilder() {
		this.code = "PR001";
		this.name = "Producto prueba";
		this.qty  = 100L;
	}
	
	public CommandProductDataBuilder withCode(String code) {
		this.code = code;
		return this;
		
	}
	
	public CommandProductDataBuilder withName(String name) {
		this.name = name;
		return this;
	} 
	
	public CommandProductDataBuilder withName(Long qty) {
		this.qty = qty;
		return this;
	}
	
	
	public CommandProduct build() {
		return new CommandProduct(code, name, qty);
	}
	
	
	

}
