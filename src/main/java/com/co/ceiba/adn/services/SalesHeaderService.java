package com.co.ceiba.adn.services;

import java.util.List;


import com.co.ceiba.adn.domain.entities.SalesHeader;

public interface SalesHeaderService {
	public List<SalesHeader> findAll();
	public SalesHeader save(SalesHeader p);
	public SalesHeader findById(Long id);
}
