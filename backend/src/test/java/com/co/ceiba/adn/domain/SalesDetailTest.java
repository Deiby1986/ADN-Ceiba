package com.co.ceiba.adn.domain;



import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import com.co.ceiba.adn.domain.builder.ProductTestDataBuilder;
import com.co.ceiba.adn.domain.builder.SalesDetailTestDataBuilder;
import com.co.ceiba.adn.domain.exceptions.FieldEmptyOrNullException;
import com.co.ceiba.adn.domain.exceptions.NoStockAvailableForProduct;
import com.co.ceiba.adn.domain.model.entities.Product;

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
	
	@Test
	public void testTotalLessThanZero() {
		SalesDetailTestDataBuilder builder = new SalesDetailTestDataBuilder();		
		assertThrows(FieldEmptyOrNullException.class, ()->builder.withTotal(0L).build());
	}
	
	@Test
	public void testNoStock() {
		ProductTestDataBuilder productBuilder = new ProductTestDataBuilder();
		Product product = productBuilder.withQty(100L).build();		
		SalesDetailTestDataBuilder builder = new SalesDetailTestDataBuilder();
		
		assertThrows(NoStockAvailableForProduct.class, ()->builder.withProduct(product).withQtyPurchased(200L).build());
	}
	

}
