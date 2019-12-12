package com.co.ceiba.adn.domain;



import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import com.co.ceiba.adn.domain.builder.ProductTestDataBuilder;
import com.co.ceiba.adn.domain.exceptions.FieldEmptyOrNullException;
import com.co.ceiba.adn.domain.exceptions.FieldLengthException;
import com.co.ceiba.adn.domain.model.entities.Product;



public class ProductTest {
	
	@Test
	public void testProductCodeNull() {		
			ProductTestDataBuilder builder = new ProductTestDataBuilder();			
			assertThrows(FieldEmptyOrNullException.class,()->builder.withCode(null).build());	
	}
	
	@Test
	public void testProductCodeLength() {		
			ProductTestDataBuilder builder = new ProductTestDataBuilder();			
			assertThrows(FieldLengthException.class,()->builder.withCode("123").build());	
	}
	
	@Test
	public void testProductNameNull() {		
			ProductTestDataBuilder builder = new ProductTestDataBuilder();			
			assertThrows(FieldEmptyOrNullException.class,()->builder.withName(null).build());	
	}
	
	@Test
	public void testProductNameLength() {		
			ProductTestDataBuilder builder = new ProductTestDataBuilder();			
			assertThrows(FieldLengthException.class,()->builder.withName("ABC").build());	
	}
	
	
	public void testProductBean() {
		String code = "123456";
		String name = "Producto123";
		Long qty = 100L;
		ProductTestDataBuilder builder = new ProductTestDataBuilder();
		Product product = builder.withCode(code).withName(name).withQty(100L).build();
		assertTrue(code.equals(product.getCodigo()) && name.equals(product.getNombre()) && qty == product.getQty());
	}

}
