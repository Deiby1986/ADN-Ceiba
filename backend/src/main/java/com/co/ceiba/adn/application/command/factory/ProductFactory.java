package com.co.ceiba.adn.application.command.factory;

import org.springframework.stereotype.Component;

import com.co.ceiba.adn.application.command.bean.CommandProduct;
import com.co.ceiba.adn.domain.model.entities.Product;

@Component
public class ProductFactory {
	
	public Product create(CommandProduct productCommand) {
		return new Product(productCommand.getId(),productCommand.getCodigo(), productCommand.getNombre(), productCommand.getQty(),productCommand.getPrice());		
	}

}
