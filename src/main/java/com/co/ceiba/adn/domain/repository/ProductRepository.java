package com.co.ceiba.adn.domain.repository;

import java.util.List;

import com.co.ceiba.adn.domain.model.dto.ProductDto;
import com.co.ceiba.adn.domain.model.entities.Product;

public interface ProductRepository {
	public List<Product> findAll();
	public List<ProductDto> findAllAsDto();	
	public Product findByCode(String code);
	public Product findById(Long id);
	public Product save(Product p);
	

}
