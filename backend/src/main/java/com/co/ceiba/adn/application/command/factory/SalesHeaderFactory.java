package com.co.ceiba.adn.application.command.factory;

import java.util.List;

import org.springframework.stereotype.Component;

import com.co.ceiba.adn.application.command.bean.CommandSalesHeader;
import com.co.ceiba.adn.domain.model.dto.SalesHeaderDto;
import com.co.ceiba.adn.domain.model.entities.SalesDetail;
import com.co.ceiba.adn.domain.model.entities.SalesHeader;

@Component
public class SalesHeaderFactory {
	
	public SalesHeader createSalesHeader(CommandSalesHeader header) {
		return new SalesHeader(header.getNombreCliente(), header.getFecha(), header.getTotal());		
	}
	
	public SalesHeaderDto createSalesHeaderDto(SalesHeader header) {
		if(header == null)
			return null;
		return new SalesHeaderDto(header.getId(), header.getClientName(), header.getDate(), header.getTotal());
		
		 
	}

}
