package com.co.ceiba.adn.application.command.handlers;

import org.springframework.stereotype.Component;

import com.co.ceiba.adn.application.command.bean.CommandSalesDetail;
import com.co.ceiba.adn.application.command.factory.SalesDetailFactory;
import com.co.ceiba.adn.domain.model.entities.SalesDetail;
import com.co.ceiba.adn.domain.services.SalesDetailService;

@Component
public class SalesDetailHandleCreate {

	private SalesDetailService detailService;
	private SalesDetailFactory detailFactory;
	public SalesDetailHandleCreate(SalesDetailService service, SalesDetailFactory factory) {		
		this.detailService = service;
		this.detailFactory = factory;
	}
	
	public void save(CommandSalesDetail detail) {
		SalesDetail det = detailFactory.create(detail);
		detailService.execute(det);
	}
	
	
}
