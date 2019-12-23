package com.co.ceiba.adn.application.command.handlers;

import java.util.List;

import org.springframework.stereotype.Component;

import com.co.ceiba.adn.domain.model.dto.SalesHeaderDto;
import com.co.ceiba.adn.infraestructura.repository.SalesHeaderRepositoryDB;

@Component
public class SalesHeaderHandleQuery {
	
	private SalesHeaderRepositoryDB headerRepository;

	public SalesHeaderHandleQuery(SalesHeaderRepositoryDB repository) {
		this.headerRepository = repository;
	}
	
	public List<SalesHeaderDto> list(){
		return headerRepository.findAllAsDto();
	}

}
