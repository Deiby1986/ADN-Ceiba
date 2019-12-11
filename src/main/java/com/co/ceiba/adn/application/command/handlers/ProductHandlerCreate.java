package com.co.ceiba.adn.application.command.handlers;

import org.springframework.stereotype.Component;

import com.co.ceiba.adn.application.command.bean.CommandProduct;
import com.co.ceiba.adn.application.command.factory.ProductFactory;
import com.co.ceiba.adn.domain.model.entities.Product;
import com.co.ceiba.adn.domain.services.ProductService;

@Component
public class ProductHandlerCreate {

	private ProductService productService;
	private ProductFactory productFactory;

	public ProductHandlerCreate(ProductService productService, ProductFactory productFactory) {
		super();
		this.productService = productService;
		this.productFactory = productFactory;
	}

	public void save(CommandProduct p) {	
		Product pr =productFactory.crearProducto(p);
		productService.execute(pr);		
	}
	
	

}
