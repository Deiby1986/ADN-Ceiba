package com.co.ceiba.adn.application.command.handlers;

import org.springframework.stereotype.Component;

import com.co.ceiba.adn.application.command.bean.CommandSalesDetail;
import com.co.ceiba.adn.application.command.factory.SalesDetailFactory;
import com.co.ceiba.adn.domain.model.entities.SalesDetail;
import com.co.ceiba.adn.domain.services.SalesDetailService;

@Component
public class SalesDetailHandleCreate {

	private SalesDetailService service;
	private SalesDetailFactory factory;
	public SalesDetailHandleCreate(SalesDetailService service, SalesDetailFactory factory) {		
		this.service = service;
		this.factory = factory;
	}
	
	public void save(CommandSalesDetail detail) {
		SalesDetail det = factory.createSalesDetail(detail);
		service.execute(det);
	}
	
	
}
