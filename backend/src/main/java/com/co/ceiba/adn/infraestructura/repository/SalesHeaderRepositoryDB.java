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

	SalesHeaderDao salesHeaderRepository;	

	public SalesHeaderRepositoryDB(SalesHeaderDao repository) {
		this.salesHeaderRepository = repository;
	}	

	@Override
	public SalesHeader save(SalesHeader header) {		
		return salesHeaderRepository.save(header);
	}	
	
	public List<SalesHeaderDto> findAllAsDto(){		
		return salesHeaderRepository.findAll().stream().map(header -> new SalesHeaderDto(header.getId(), header.getClientName(), header.getDate(), header.getTotal())).collect(Collectors.toList());
	}



	

}
