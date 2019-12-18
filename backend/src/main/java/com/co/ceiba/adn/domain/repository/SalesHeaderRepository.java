package com.co.ceiba.adn.domain.repository;

import java.util.List;

import com.co.ceiba.adn.domain.model.dto.SalesHeaderDto;
import com.co.ceiba.adn.domain.model.entities.SalesHeader;

public interface SalesHeaderRepository {
	
	public SalesHeader save(SalesHeader p);	
	public List<SalesHeaderDto> findAllAsDto();
}
