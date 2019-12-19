package com.co.ceiba.adn.application.command;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.co.ceiba.adn.application.command.bean.CommandProduct;
import com.co.ceiba.adn.application.command.handlers.ProductHandlerCreate;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "http://localhost:4200", methods= {RequestMethod.GET})
public class ProductCommand {
	
	ProductHandlerCreate service;	
	
	public ProductCommand(ProductHandlerCreate service) {	
		this.service = service;
	}
	
	@PostMapping
	@ApiOperation("/addProduct")
	public void addProduct(@RequestBody CommandProduct pr){				
		service.save(pr);
	}

}
