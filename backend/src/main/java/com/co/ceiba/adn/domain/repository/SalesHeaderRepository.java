package com.co.ceiba.adn.domain.repository;

import java.util.List;

import com.co.ceiba.adn.domain.model.entities.SalesHeader;

public interface SalesHeaderRepository {
	public List<SalesHeader> findAll();
	public SalesHeader save(SalesHeader p);
	public SalesHeader findById(Long id);
}
