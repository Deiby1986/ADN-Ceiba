package com.co.ceiba.adn.infraestructura.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.co.ceiba.adn.domain.services.ProductService;
import com.co.ceiba.adn.infraestructura.dao.ProductDao;
import com.co.ceiba.adn.infraestructura.repository.ProductRepositoryDB;



@Configuration
public class BeanServicio {
	
	@Autowired
	private ProductDao daopDao;
	
	public BeanServicio(ProductDao daopDao) {
		this.daopDao = daopDao;
	}
	
	@Bean
	public ProductService createProductService() {		
		return new ProductService(new ProductRepositoryDB(daopDao));
	}
	
	
	 

}
