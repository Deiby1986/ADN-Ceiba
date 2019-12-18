package com.co.ceiba.adn.infraestructura.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.co.ceiba.adn.domain.model.dto.SalesHeaderDto;
import com.co.ceiba.adn.domain.model.entities.SalesHeader;
import com.co.ceiba.adn.domain.repository.SalesHeaderRepository;
import com.co.ceiba.adn.infraestructura.dao.SalesHeaderDao;

@Component
public class SalesHeaderRepositoryDB implements SalesHeaderRepository {

	SalesHeaderDao salesDao;	

	public SalesHeaderRepositoryDB(SalesHeaderDao salesDao) {
		super();
		this.salesDao = salesDao;
	}	

	@Override
	public SalesHeader save(SalesHeader p) {		
		return salesDao.save(p);
	}	
	
	public List<SalesHeaderDto> findAllAsDto(){
		return salesDao.findAll().stream().map(header -> new SalesHeaderDto(header.getId(), header.getClientName(), header.getDate(), header.getTotal())).collect(Collectors.toList());
	}



	

}
