package com.co.ceiba.adn.application.command.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CommandSalesDetail {
	
	private Long id;	
	private Long  idHeader;
	private Long  idProduct;	
	private Long qtyPurchased;	
	private Long total;	
	
	public CommandSalesDetail() {
		
	}
	
	public CommandSalesDetail(Long idHeader, Long idProduct, Long qtyPurchased, Long total) {		
		this.idHeader = idHeader;
		this.idProduct = idProduct;
		this.qtyPurchased = qtyPurchased;
		this.total = total;
	}

	
	
	
	
	

}
