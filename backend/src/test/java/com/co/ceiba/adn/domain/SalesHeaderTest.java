package com.co.ceiba.adn.domain;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import com.co.ceiba.adn.domain.builder.SalesHeaderTestDataBuilder;
import com.co.ceiba.adn.domain.exceptions.FieldEmptyOrNullException;

public class SalesHeaderTest {
	
	@Test
	public void testSalesHeaderWithNameNull() {
		SalesHeaderTestDataBuilder builder = new SalesHeaderTestDataBuilder();
		assertThrows(FieldEmptyOrNullException.class,()-> builder.withName(null).build());
	}
	
	@Test
	public void testSalesHeaderWithDateNull() {
		SalesHeaderTestDataBuilder builder = new SalesHeaderTestDataBuilder();
		assertThrows(FieldEmptyOrNullException.class,()-> builder.withDate(null).build());
	}
	
	@Test
	public void testSalesHeaderWithTotalNull() {
		SalesHeaderTestDataBuilder builder = new SalesHeaderTestDataBuilder();
		assertThrows(FieldEmptyOrNullException.class,()-> builder.withTotal(null).build());
	}

}
