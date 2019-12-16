package com.co.ceiba.adn.infraestructura.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.co.ceiba.adn.domain.model.entities.SalesDetail;
import com.co.ceiba.adn.domain.repository.SalesDetailRepository;
import com.co.ceiba.adn.infraestructura.dao.SalesDetailDao;

@Component
public class SalesDetailRepositoryDB implements SalesDetailRepository{

	SalesDetailDao detailDao;
	
	
	public SalesDetailRepositoryDB(SalesDetailDao detailDao) {		
		this.detailDao = detailDao;
	}

	@Override
	public List<SalesDetail> findAll() {		
		return detailDao.findAll();
	}

	@Override
	public SalesDetail save(SalesDetail p) {		
		return detailDao.save(p);
	}

	@Override
	public SalesDetail findById(Long id) {
		return detailDao.findById(id).orElse(null);
	}

}
