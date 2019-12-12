package com.co.ceiba.adn.infraestructura.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.co.ceiba.adn.domain.services.ProductService;
import com.co.ceiba.adn.infraestructura.dao.ProductDao;
import com.co.ceiba.adn.infraestructura.repository.ProductRepositoryDB;



@Configuration
public class BeanServicio {
	
	@Bean
	public ProductService createProductService(ProductDao daopDao) {		
		return new ProductService(new ProductRepositoryDB(daopDao));
	} 

}
