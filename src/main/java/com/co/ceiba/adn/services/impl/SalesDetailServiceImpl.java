package com.co.ceiba.adn.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.co.ceiba.adn.domain.model.entities.SalesDetail;
import com.co.ceiba.adn.domain.repository.SalesDetailRepository;
import com.co.ceiba.adn.infraestructura.dao.SalesDetailDao;

//TODO: Migrar a com.co.ceiba.adn.domain.services
public class SalesDetailServiceImpl implements SalesDetailRepository {
	
	@Autowired
	SalesDetailDao sales;

	@Override
	public List<SalesDetail> findAll() {		
		return sales.findAll();
	}

	@Override
	public SalesDetail save(SalesDetail p) {		
		return sales.save(p);
	}

	@Override
	public SalesDetail findById(Long id) {
		return sales.findById(id).orElse(null);
	}

}
