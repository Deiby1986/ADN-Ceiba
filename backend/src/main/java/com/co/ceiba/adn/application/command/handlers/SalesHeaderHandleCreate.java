package com.co.ceiba.adn.application.command.handlers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.co.ceiba.adn.application.command.bean.CommandSalesDetail;
import com.co.ceiba.adn.application.command.bean.CommandSalesHeader;
import com.co.ceiba.adn.application.command.factory.SalesHeaderFactory;
import com.co.ceiba.adn.domain.model.entities.SalesHeader;
import com.co.ceiba.adn.domain.services.SalesHeaderService;

@Component
public class SalesHeaderHandleCreate {
	
	private SalesHeaderService headerService;	
	private SalesHeaderFactory headerFactory;
	SalesDetailHandleCreate detailHandler;
	public SalesHeaderHandleCreate(SalesHeaderService service, SalesHeaderFactory factory,SalesDetailHandleCreate detailCreate) {
		this.headerService = service;
		this.headerFactory = factory;
		this.detailHandler = detailCreate;
	}
	
	@Transactional
	public void save(CommandSalesHeader command) {
		List<CommandSalesDetail> details =  command.getDetails();		
		SalesHeader headerTosave = headerFactory.create(command);
		SalesHeader header = headerService.execute(headerTosave);		
		saveDetails(details, header);
	}
	
	private void saveDetails(List<CommandSalesDetail> details,SalesHeader header) {		
		if(details == null || details.isEmpty())
			return;			
		for (int i = 0; i < details.size(); i++) {
			CommandSalesDetail det = details.get(i);
			det.setIdHeader(header.getId());
		 	detailHandler.save(det);		
		}
		
	}
	
	
	
	

}
