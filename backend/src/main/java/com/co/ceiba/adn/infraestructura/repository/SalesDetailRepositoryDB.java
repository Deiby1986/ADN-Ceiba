package com.co.ceiba.adn.infraestructura.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.co.ceiba.adn.domain.model.entities.SalesDetail;
import com.co.ceiba.adn.domain.repository.SalesDetailRepository;
import com.co.ceiba.adn.infraestructura.dao.SalesDetailDao;

@Component
public class SalesDetailRepositoryDB implements SalesDetailRepository{

	SalesDetailDao detailRepository;
	
	
	public SalesDetailRepositoryDB(SalesDetailDao repository) {		
		this.detailRepository = repository;
	}

	@Override
	public List<SalesDetail> findAll() {		
		return detailRepository.findAll();
	}

	@Override
	public SalesDetail save(SalesDetail detail) {		
		return detailRepository.save(detail);
	}

}
