package com.co.ceiba.adn.domain.repository;

import java.util.List;

import com.co.ceiba.adn.domain.model.entities.SalesDetail;

public interface SalesDetailRepository {
	public List<SalesDetail> findAll();
	public SalesDetail save(SalesDetail p);
	public SalesDetail findById(Long id);

}
