package com.co.ceiba.adn.domain.services;

import com.co.ceiba.adn.domain.exceptions.CodeExistsException;
import com.co.ceiba.adn.domain.model.entities.Product;
import com.co.ceiba.adn.domain.repository.ProductRepository;

public class ProductService {
	
	private ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {		
		this.productRepository = productRepository;
	}
	
	public Product execute(Product p) {
		if(!validateProduct(p))
			throw  new CodeExistsException();		 
		return productRepository.save(p); 
	}
	
	private boolean validateProduct(Product p) {
		if (p.getId() != null && p.getId() != 0) 
				return true;
		return productRepository.findByCode(p.getCodigo())==null;
	}
	
	
	

}
