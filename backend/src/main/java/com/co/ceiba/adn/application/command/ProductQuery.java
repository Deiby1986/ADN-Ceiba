package com.co.ceiba.adn.application.command;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.co.ceiba.adn.application.command.handlers.ProductHandleQuery;
import com.co.ceiba.adn.domain.model.dto.ProductDto;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "http://localhost:4200", methods= {RequestMethod.GET})
public class ProductQuery {
	
	ProductHandleQuery handler;

	public ProductQuery(ProductHandleQuery handler) {		
		this.handler = handler;
	}
	
	@GetMapping
	@ApiOperation("/list")
	public List<ProductDto> listar(){
		return handler.list();
	}
	 

}
