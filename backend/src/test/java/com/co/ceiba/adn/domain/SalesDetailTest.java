package com.co.ceiba.adn.domain;



import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import com.co.ceiba.adn.domain.builder.SalesDetailTestDataBuilder;
import com.co.ceiba.adn.domain.exceptions.FieldEmptyOrNullException;

public class SalesDetailTest {

	@Test
	public void testSalesDetailHeaderNull() {
		SalesDetailTestDataBuilder builder = new SalesDetailTestDataBuilder();
		
		assertThrows(FieldEmptyOrNullException.class, ()->builder.withHeader(null).build());		
	}
	
	@Test
	public void testSalesDetailProductNull() {
		SalesDetailTestDataBuilder builder = new SalesDetailTestDataBuilder();
		
		assertThrows(FieldEmptyOrNullException.class, ()->builder.withProduct(null).build());		
	}
	
	@Test
	public void testSalesDetailQtyZero() {
		SalesDetailTestDataBuilder builder = new SalesDetailTestDataBuilder();
		
		assertThrows(FieldEmptyOrNullException.class, ()->builder.withQtyPurchased(0L).build());		
	}	

}
