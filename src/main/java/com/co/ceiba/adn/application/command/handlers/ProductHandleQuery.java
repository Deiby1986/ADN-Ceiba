package com.co.ceiba.adn.application.command.handlers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.co.ceiba.adn.domain.model.dto.ProductDto;
import com.co.ceiba.adn.infraestructura.dao.ProductDao;
import com.co.ceiba.adn.infraestructura.repository.ProductRepositoryDB;

@Component
public class ProductHandleQuery {
	ProductRepositoryDB productoDao;

	public ProductHandleQuery(ProductRepositoryDB productoDao) {
		super();
		this.productoDao = productoDao;
	}
	
	
	public List<ProductDto>  list(){
		return productoDao.findAllAsDto();
	}
	
	
      
}
