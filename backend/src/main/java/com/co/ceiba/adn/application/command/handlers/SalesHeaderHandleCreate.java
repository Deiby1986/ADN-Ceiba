package com.co.ceiba.adn.application.command.handlers;

import java.util.List;

import org.springframework.stereotype.Component;

import com.co.ceiba.adn.application.command.bean.CommandSalesDetail;
import com.co.ceiba.adn.application.command.bean.CommandSalesHeader;
import com.co.ceiba.adn.application.command.factory.SalesHeaderFactory;
import com.co.ceiba.adn.domain.model.entities.SalesHeader;
import com.co.ceiba.adn.domain.services.SalesHeaderService;

@Component
public class SalesHeaderHandleCreate {
	
	private SalesHeaderService service;	
	private SalesHeaderFactory factoryHeader;
	SalesDetailHandleCreate detailCreate;
	public SalesHeaderHandleCreate(SalesHeaderService service, SalesHeaderFactory factory,SalesDetailHandleCreate detailCreate) {
		super();
		this.service = service;
		this.factoryHeader = factory;
		this.detailCreate = detailCreate;
	}
	
	public void save(CommandSalesHeader command) {
		SalesHeader headerTosave = factoryHeader.createSalesHeader(command);
		SalesHeader header = service.execute(headerTosave);
		List<CommandSalesDetail> details =  command.getDetalles();	
		saveDetails(details, header);
	}
	
	private void saveDetails(List<CommandSalesDetail> details,SalesHeader header) {
		if(details == null || details.isEmpty())
			return;			
		for (int i = 0; i < details.size(); i++) {
			CommandSalesDetail det = details.get(i);
			det.setIdHeader(header.getId());
		 	detailCreate.save(det);			
		}
	}
	
	

}
