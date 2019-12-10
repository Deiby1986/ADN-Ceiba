package com.co.ceiba.adn.services;

import java.util.List;

import com.co.ceiba.adn.domain.entities.Product;

public interface ProductService {
	public List<Product> findAll();
	public Product save(Product p);
	public Product findById(Long id);
	public boolean findByCode(String code);

}
