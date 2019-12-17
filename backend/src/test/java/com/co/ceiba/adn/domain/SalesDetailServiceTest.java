package com.co.ceiba.adn.domain;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.Mockito;

import com.co.ceiba.adn.domain.builder.SalesDetailTestDataBuilder;
import com.co.ceiba.adn.domain.model.entities.SalesDetail;
import com.co.ceiba.adn.domain.services.SalesDetailService;
import com.co.ceiba.adn.infraestructura.repository.SalesDetailRepositoryDB;

public class SalesDetailServiceTest {
	
	@Test
	public void testSavingProductNull() {
		SalesDetail detail = new SalesDetailTestDataBuilder().build();
		SalesDetailRepositoryDB repository = Mockito.mock(SalesDetailRepositoryDB.class);
		Mockito.when(repository.save(detail)).thenReturn(detail);
		SalesDetailService service = new SalesDetailService(repository);
		SalesDetail savedDetail = service.execute(detail);
		assertTrue(detail.getHeader().equals(savedDetail.getHeader()));
	}	
	
	

}
