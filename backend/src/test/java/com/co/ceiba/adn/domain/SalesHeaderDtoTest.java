package com.co.ceiba.adn.domain;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import com.co.ceiba.adn.domain.builder.SalesHeaderDtoTestDataBuilder;
import com.co.ceiba.adn.domain.builder.SalesHeaderTestDataBuilder;
import com.co.ceiba.adn.domain.exceptions.FieldEmptyOrNullException;
import com.co.ceiba.adn.domain.model.dto.SalesHeaderDto;

public class SalesHeaderDtoTest {
	
	@Test
	public void testSalesHeaderDto() {
		SalesHeaderDtoTestDataBuilder builder = new SalesHeaderDtoTestDataBuilder();		
		SalesHeaderDto header=  builder.withName("test").withTotal(1D).withDate("01/01/2019").build();		
		assertNotEquals(0, header.getTotal());
	}
	
	

}
