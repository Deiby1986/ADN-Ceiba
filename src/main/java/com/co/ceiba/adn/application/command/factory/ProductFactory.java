package com.co.ceiba.adn.application.command.factory;

import javax.activation.CommandObject;

import org.springframework.stereotype.Component;

import com.co.ceiba.adn.application.command.bean.CommandProduct;
import com.co.ceiba.adn.domain.entities.Product;

@Component
public class ProductFactory {
	
	public Product crearProducto(CommandProduct pr) {
		return new Product(pr.getCodigo(), pr.getNombre(), pr.getQty());		
	}

}
