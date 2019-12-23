package com.co.ceiba.adn.application.command;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.ceiba.adn.application.command.handlers.ProductHandleQuery;
import com.co.ceiba.adn.domain.model.dto.ProductDto;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/products")

public class ProductQueryController {
	
	ProductHandleQuery productQueryHandler;

	public ProductQueryController(ProductHandleQuery handler) {		
		this.productQueryHandler = handler;
	}
	
	@GetMapping
	@ApiOperation("/list")
	public List<ProductDto> listar(){
		return productQueryHandler.list();
	}
	 

}
