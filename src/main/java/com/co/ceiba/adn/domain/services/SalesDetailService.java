package com.co.ceiba.adn.domain.services;

import com.co.ceiba.adn.domain.model.entities.SalesDetail;
import com.co.ceiba.adn.domain.repository.SalesDetailRepository;

public class SalesDetailService {
	
	private SalesDetailRepository repository;

	public SalesDetailService(SalesDetailRepository repository) {		
		this.repository = repository;
	}
	
	public SalesDetail execute(SalesDetail d) {
		return repository.save(d);
	}
	
	

}
