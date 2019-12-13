package com.co.ceiba.adn.application.command.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.co.ceiba.adn.application.command.bean.CommandSalesDetail;
import com.co.ceiba.adn.domain.model.entities.Product;
import com.co.ceiba.adn.domain.model.entities.SalesDetail;
import com.co.ceiba.adn.domain.model.entities.SalesHeader;
import com.co.ceiba.adn.infraestructura.dao.ProductDao;
import com.co.ceiba.adn.infraestructura.dao.SalesHeaderDao;

@Component
public class SalesDetailFactory {
	@Autowired
	ProductDao daoProducto;
	@Autowired 
	SalesHeaderDao daoHeader;
	public SalesDetail createSalesDetail(CommandSalesDetail detail) {
		
		SalesHeader header=daoHeader.findById(detail.getIdHeader()).orElse(null);
		Product pr = daoProducto.findById(detail.getIdProduct()).orElse(null);	
		
		return new SalesDetail(header, pr, detail.getQtyPurchased(), detail.getTotal());
		
	}

}
