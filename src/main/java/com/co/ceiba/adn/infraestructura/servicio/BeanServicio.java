package com.co.ceiba.adn.infraestructura.servicio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.co.ceiba.adn.domain.services.ProductService;
import com.co.ceiba.adn.domain.services.SalesDetailService;
import com.co.ceiba.adn.infraestructura.dao.ProductDao;
import com.co.ceiba.adn.infraestructura.dao.SalesDetailDao;
import com.co.ceiba.adn.infraestructura.repository.ProductRepositoryDB;
import com.co.ceiba.adn.infraestructura.repository.SalesDetailRepositoryDB;



@Configuration
public class BeanServicio {
	
	@Bean
	public ProductService createProductService(ProductDao daopDao) {		
		return new ProductService(new ProductRepositoryDB(daopDao));
	} 
	
	@Bean
	public SalesDetailService createDetailService(SalesDetailDao daoDetail) {
		return new SalesDetailService(new SalesDetailRepositoryDB(daoDetail));
	}

}
