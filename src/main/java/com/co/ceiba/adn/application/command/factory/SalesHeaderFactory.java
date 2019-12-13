package com.co.ceiba.adn.application.command.factory;

import org.springframework.stereotype.Component;

import com.co.ceiba.adn.application.command.bean.CommandSalesHeader;
import com.co.ceiba.adn.domain.model.entities.SalesHeader;

@Component
public class SalesHeaderFactory {
	
	public SalesHeader createSalesHeader(CommandSalesHeader header) {
		return new SalesHeader(header.getNombreCliente(), header.getFecha(), header.getTotal());		
	}

}
