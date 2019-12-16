package com.co.ceiba.adn.application.command.factory;

import org.springframework.stereotype.Component;

import com.co.ceiba.adn.application.command.bean.CommandProduct;
import com.co.ceiba.adn.domain.model.entities.Product;

@Component
public class ProductFactory {
	
	public Product createProducto(CommandProduct pr) {
		return new Product(pr.getCodigo(), pr.getNombre(), pr.getQty(),pr.getPrice());		
	}

}
