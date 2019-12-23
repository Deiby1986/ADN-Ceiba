package com.co.ceiba.adn.domain.services;

import com.co.ceiba.adn.domain.model.entities.SalesDetail;
import com.co.ceiba.adn.domain.repository.SalesDetailRepository;


public class SalesDetailService {
	
	private SalesDetailRepository detailRepository;

	public SalesDetailService(SalesDetailRepository repository) {		
		this.detailRepository = repository;
	}
	
	public SalesDetail execute(SalesDetail d) {
		d.getProduct().setQty(d.getProduct().getQty()-d.getQtyPurchased());
		return detailRepository.save(d);
	}
	
	

}
