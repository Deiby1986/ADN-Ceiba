package com.co.ceiba.adn.application.command;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.co.ceiba.adn.application.command.handlers.SalesHeaderHandleQuery;
import com.co.ceiba.adn.domain.model.dto.SalesHeaderDto;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/sales")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
public class SalesHeaderQuery {
	
	SalesHeaderHandleQuery handler;

	public SalesHeaderQuery(SalesHeaderHandleQuery handler) {
		this.handler = handler;
	}	
	
	@GetMapping
	@ApiOperation("/list")
	public List<SalesHeaderDto> listar(){
		return handler.list();
	}

}
