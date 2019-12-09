package com.adn.ceiba.product;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.co.ceiba.adn.entities.Product;
import com.co.ceiba.adn.services.impl.ProductServiceImpl;

class testProduct {

	@Test
	void testSaveNewProduct() {
		ProductServiceImpl service = new ProductServiceImpl();
		Product pr = new Product("10001","Producto test",100L);
		pr = service.save(pr);
		assertTrue(pr.getId() > 0);
		
	}
	
	@Test
	void testmodifyProduct() {		
	}
	
	void testGetProduct() {
		
	}

}
