package com.co.ceiba.adn.domain;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.Mockito;

import com.co.ceiba.adn.domain.builder.SalesHeaderTestDataBuilder;
import com.co.ceiba.adn.domain.model.entities.SalesHeader;
import com.co.ceiba.adn.domain.services.SalesHeaderService;
import com.co.ceiba.adn.infraestructura.repository.SalesHeaderRepositoryDB;

public class SalesHeaderServiceTest {
	
	@Test
	public void testSaveHeader() {
		SalesHeader header = new SalesHeaderTestDataBuilder().build();
		SalesHeaderRepositoryDB salesHeaderRepo = Mockito.mock(SalesHeaderRepositoryDB.class);
		Mockito.when(salesHeaderRepo.save(header)).thenReturn(header);
		SalesHeaderService headerService = new SalesHeaderService(salesHeaderRepo);
		SalesHeader headerSaved = headerService.execute(header);
		assertTrue(header.getTotal().equals(headerSaved.getTotal()));
	}

}
