package com.co.ceiba.adn.infraestructura.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.co.ceiba.adn.application.command.factory.SalesHeaderFactory;
import com.co.ceiba.adn.domain.model.dto.SalesDetailDto;
import com.co.ceiba.adn.domain.model.dto.SalesHeaderDto;
import com.co.ceiba.adn.domain.model.entities.SalesHeader;
import com.co.ceiba.adn.domain.repository.SalesHeaderRepository;
import com.co.ceiba.adn.infraestructura.dao.SalesDetailDao;
import com.co.ceiba.adn.infraestructura.dao.SalesHeaderDao;

@Component
public class SalesHeaderRepositoryDB implements SalesHeaderRepository {

	SalesHeaderDao salesDao;
	SalesDetailDao detailsDao;

	public SalesHeaderRepositoryDB(SalesHeaderDao salesDao,SalesDetailDao detailsDao) {
		super();
		this.salesDao = salesDao;
		this.detailsDao = detailsDao;
	}	

	@Override
	public SalesHeader save(SalesHeader p) {		
		return salesDao.save(p);
	}	
	
	public List<SalesHeaderDto> findAllAsDto(){		
		return salesDao.findAll().stream().map(header -> new SalesHeaderDto(header.getId(), header.getClientName(), header.getDate(), header.getTotal())).collect(Collectors.toList());
	}

	@Override
	public SalesHeaderDto findById(Long id) {		
		return new SalesHeaderFactory().createSalesHeaderDto(salesDao.findById(id).orElse(null));
	}

	@Override
	public List<SalesDetailDto> findDetails(Long idHeader) {		
		return detailsDao.findAllForHeaderId(idHeader).stream().map(detail -> new SalesDetailDto(detail.getId(), detail.getHeader().getId(), detail.getProduct().getNombre(), detail.getQtyPurchased(), detail.getTotal())).collect(Collectors.toList());
	}



	

}
