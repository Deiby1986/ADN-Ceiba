package com.co.ceiba.adn.domain;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.mockito.Mockito;

import com.co.ceiba.adn.domain.builder.SalesHeaderTestDataBuilder;
import com.co.ceiba.adn.domain.exceptions.CanSellOnWekendsException;
import com.co.ceiba.adn.domain.exceptions.InvalidDateException;
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
	
	@Test
	public void testInvalidDate() {
		SalesHeader header = new SalesHeaderTestDataBuilder().withDate("2019-01-04").build();
		SalesHeaderRepositoryDB salesHeaderRepo = Mockito.mock(SalesHeaderRepositoryDB.class);
		Mockito.when(salesHeaderRepo.save(header)).thenReturn(header);
		SalesHeaderService headerService = new SalesHeaderService(salesHeaderRepo);
		assertThrows(InvalidDateException.class, ()->headerService.execute(header));
		
	}
	
	
	@Test
	public void testSaleOnWeekend() {
		SalesHeader header = new SalesHeaderTestDataBuilder().withDate("14/12/2019").build();
		SalesHeaderRepositoryDB salesHeaderRepo = Mockito.mock(SalesHeaderRepositoryDB.class);
		Mockito.when(salesHeaderRepo.save(header)).thenReturn(header);
		SalesHeaderService headerService = new SalesHeaderService(salesHeaderRepo);
		assertThrows(CanSellOnWekendsException.class, ()->headerService.execute(header));
		
	}

}
