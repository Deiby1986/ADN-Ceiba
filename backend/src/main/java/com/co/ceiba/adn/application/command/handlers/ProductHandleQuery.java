package com.co.ceiba.adn.application.command.handlers;

import java.util.List;

import org.springframework.stereotype.Component;

import com.co.ceiba.adn.domain.model.dto.ProductDto;
import com.co.ceiba.adn.infraestructura.repository.ProductRepositoryDB;

@Component
public class ProductHandleQuery {
	private ProductRepositoryDB productoDao;

	public ProductHandleQuery(ProductRepositoryDB productoDao) {		
		this.productoDao = productoDao;
	}
	
	
	public List<ProductDto>  list(){
		return productoDao.findAllAsDto();
	}
	
	
      
}
