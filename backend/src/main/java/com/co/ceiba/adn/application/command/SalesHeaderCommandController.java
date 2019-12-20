package com.co.ceiba.adn.application.command;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.ceiba.adn.application.command.bean.CommandSalesHeader;
import com.co.ceiba.adn.application.command.handlers.SalesHeaderHandleCreate;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/sales")

public class SalesHeaderCommandController {
	private SalesHeaderHandleCreate service;
	
	
	public SalesHeaderCommandController(SalesHeaderHandleCreate service) {
		super();
		this.service = service;
	}


	@PostMapping
	@ApiOperation("/addProduct")
	public void addSales(@RequestBody CommandSalesHeader sales){
		service.save(sales);
	}
	
}
