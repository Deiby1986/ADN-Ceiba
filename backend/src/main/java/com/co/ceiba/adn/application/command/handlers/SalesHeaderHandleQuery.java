package com.co.ceiba.adn.application.command.handlers;

import java.util.List;

import org.springframework.stereotype.Component;

import com.co.ceiba.adn.domain.model.dto.SalesHeaderDto;
import com.co.ceiba.adn.infraestructura.repository.SalesHeaderRepositoryDB;

@Component
public class SalesHeaderHandleQuery {
	
	private SalesHeaderRepositoryDB repository;

	public SalesHeaderHandleQuery(SalesHeaderRepositoryDB repository) {
		this.repository = repository;
	}
	
	public List<SalesHeaderDto> list(){
		return repository.findAllAsDto();
	}
	
	public SalesHeaderDto findById(Long id) {
		return repository.findById(id);
	}

}
