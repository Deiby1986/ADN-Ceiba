package com.co.ceiba.adn.infraestructura.repository;

import java.util.List;

import com.co.ceiba.adn.domain.model.entities.SalesHeader;
import com.co.ceiba.adn.domain.repository.SalesHeaderRepository;
import com.co.ceiba.adn.infraestructura.dao.SalesHeaderDao;

public class SalesHeaderRepositoryDB implements SalesHeaderRepository {

	SalesHeaderDao salesDao;	

	public SalesHeaderRepositoryDB(SalesHeaderDao salesDao) {
		super();
		this.salesDao = salesDao;
	}

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
