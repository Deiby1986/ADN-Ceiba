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
	private SalesHeaderHandleCreate serviceSalesHandle;
	
	
	public SalesHeaderCommandController(SalesHeaderHandleCreate service) {
		this.serviceSalesHandle = service;
	}


	@PostMapping
	@ApiOperation("/addProduct")
	public void add(@RequestBody CommandSalesHeader sales){
		serviceSalesHandle.save(sales);
	}
	
}
