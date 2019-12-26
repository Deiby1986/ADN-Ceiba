package com.co.ceiba.adn.domain.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SalesDetailDto {
	private Long id;	
	
	private Long header;	
	
	private String product;
	
	private Long qtyPurchased;
	
	private Long total;

	public SalesDetailDto(Long id, Long header, String product, Long qtyPurchased, Long total) {
		this.id = id;
		this.header = header;
		this.product = product;
		this.qtyPurchased = qtyPurchased;
		this.total = total;
	}
	
	
	


}
