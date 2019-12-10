package com.co.ceiba.adn.services;

import java.util.List;

import com.co.ceiba.adn.domain.entities.SalesDetail;

public interface SalesDetailService {
	public List<SalesDetail> findAll();
	public SalesDetail save(SalesDetail p);
	public SalesDetail findById(Long id);

}
