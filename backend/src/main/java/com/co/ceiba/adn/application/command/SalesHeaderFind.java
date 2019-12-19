package com.co.ceiba.adn.application.command;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.ceiba.adn.application.command.handlers.SalesHeaderHandleQuery;
import com.co.ceiba.adn.domain.model.dto.SalesHeaderDto;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/sale")
public class SalesHeaderFind {
	
	SalesHeaderHandleQuery handler;

	public SalesHeaderFind(SalesHeaderHandleQuery handler) {
		this.handler = handler;
	}	
	
	@GetMapping
	@ApiOperation("/{}")
	public SalesHeaderDto find(@PathVariable Long id){
		return handler.findById(id);
	}

}
