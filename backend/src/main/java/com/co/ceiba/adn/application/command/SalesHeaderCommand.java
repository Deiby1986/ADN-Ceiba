package com.co.ceiba.adn.application.command;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.co.ceiba.adn.application.command.bean.CommandSalesHeader;
import com.co.ceiba.adn.application.command.handlers.SalesHeaderHandleCreate;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/sales")

public class SalesHeaderCommand {
	private SalesHeaderHandleCreate service;
	
	
	public SalesHeaderCommand(SalesHeaderHandleCreate service) {
		super();
		this.service = service;
	}


	@PostMapping
	@ApiOperation("/addProduct")
	public void addSales(@RequestBody CommandSalesHeader sales){
		service.save(sales);
	}
	
}
