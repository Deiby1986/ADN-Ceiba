package com.co.ceiba.adn.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.ceiba.adn.dao.ProductDao;
import com.co.ceiba.adn.entities.Product;
import com.co.ceiba.adn.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao productDao;
	
	public List<Product> findAll(){
		return productDao.findAll();
		
	}
	
	public Product save(Product p) {
		return productDao.save(p);		
	}
	
	public Product findById(Long id) {
		return productDao.findById(id).orElse(null);
	}
	
}
