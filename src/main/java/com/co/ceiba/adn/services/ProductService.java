package com.co.ceiba.adn.services;

import java.util.List;

import com.co.ceiba.adn.entities.Product;

public interface ProductService {
	public List<Product> findAll();
	public Product save(Product p);
	public Product findById(Long id);

}
