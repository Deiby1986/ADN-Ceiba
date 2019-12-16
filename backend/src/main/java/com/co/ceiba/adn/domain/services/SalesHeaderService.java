package com.co.ceiba.adn.domain.services;

import com.co.ceiba.adn.domain.model.entities.SalesHeader;
import com.co.ceiba.adn.domain.repository.SalesHeaderRepository;

public class SalesHeaderService {
	
	private SalesHeaderRepository repository;

	public SalesHeaderService(SalesHeaderRepository repository) {
		super();
		this.repository = repository;
	}
	
	public SalesHeader execute(SalesHeader header) {
		return repository.save(header);
	}

}
