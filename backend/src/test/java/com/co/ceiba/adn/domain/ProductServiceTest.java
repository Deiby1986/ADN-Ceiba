package com.co.ceiba.adn.domain;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.mockito.Mockito;

import com.co.ceiba.adn.domain.builder.ProductTestDataBuilder;
import com.co.ceiba.adn.domain.exceptions.CodeExistsException;
import com.co.ceiba.adn.domain.model.entities.Product;
import com.co.ceiba.adn.domain.services.ProductService;
import com.co.ceiba.adn.infraestructura.repository.ProductRepositoryDB;

public class ProductServiceTest {
	
	@Test
	public void testProductExistence() {		
		Product product = new ProductTestDataBuilder().withId(null).build();
		ProductRepositoryDB productRepository = Mockito.mock(ProductRepositoryDB.class);
		Mockito.when(productRepository.findByCode(Mockito.any())).thenReturn(product);
		
		ProductService service = new ProductService(productRepository);
		
		assertThrows(CodeExistsException.class,()-> service.execute(product));
		
	}	
	
	@Test
	public void testProductSaving() {		
		Product product = new ProductTestDataBuilder().build();
		ProductRepositoryDB productRepository = Mockito.mock(ProductRepositoryDB.class);
		Mockito.when(productRepository.findByCode(Mockito.any())).thenReturn(null);	
		Mockito.when(productRepository.save(product)).thenReturn(product);
		ProductService service = new ProductService(productRepository);
		Product  productSaved = service.execute(product);
		assertTrue(product.getCodigo().equals(productSaved.getCodigo()));		
	}

}
