package com.co.ceiba.adn.adapters;
		
import org.springframework.stereotype.Component;

import com.co.ceiba.adn.application.command.bean.CommandProduct;
import com.co.ceiba.adn.application.command.factory.ProductFactory;
import com.co.ceiba.adn.domain.entities.Product;
import com.co.ceiba.adn.services.ProductService;

@Component
public class ProductAdapter {
	private ProductService productService;
	private ProductFactory productFactory;
	
	public ProductAdapter(ProductService productService, ProductFactory productFactory) {		
		this.productService = productService;
		this.productFactory = productFactory;
	}
	
	
	public boolean crearProducto(CommandProduct pr) {
		//ModelMapper modelMapper = new ModelMapper();	
		//Product product = modelMapper.map(pr, Product.class);
		Product product = productFactory.crearProducto(pr);
		
		
		if(productService.findByCode(pr.getCodigo()))
			return false;
		productService.save(product);
		return true;
	}
	
	
	

}
