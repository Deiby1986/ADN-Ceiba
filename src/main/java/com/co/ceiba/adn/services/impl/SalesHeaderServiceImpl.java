package com.co.ceiba.adn.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.co.ceiba.adn.domain.entities.SalesHeader;
import com.co.ceiba.adn.infraestructura.dao.SalesHeaderDao;
import com.co.ceiba.adn.services.SalesHeaderService;

public class SalesHeaderServiceImpl implements SalesHeaderService {
	
	@Autowired
	SalesHeaderDao salesDao;

	@Override
	public List<SalesHeader> findAll() {		
		return salesDao.findAll();
	}

	@Override
	public SalesHeader save(SalesHeader p) {		
		return salesDao.save(p);
	}

	@Override
	public SalesHeader findById(Long id) {
		return salesDao.findById(id).orElse(null);
	}

}
