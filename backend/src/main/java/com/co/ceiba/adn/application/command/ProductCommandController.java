package com.co.ceiba.adn.application.command;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.ceiba.adn.application.command.bean.CommandProduct;
import com.co.ceiba.adn.application.command.handlers.ProductHandlerCreate;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/products")

public class ProductCommandController {
	
	ProductHandlerCreate serviceProduct;	
	
	public ProductCommandController(ProductHandlerCreate serviceProduct) {	
		this.serviceProduct = serviceProduct;
	}
	
	@PostMapping
	@ApiOperation("/addProduct")
	public void add(@RequestBody CommandProduct productCommand){				
		serviceProduct.save(productCommand);
	}

}
