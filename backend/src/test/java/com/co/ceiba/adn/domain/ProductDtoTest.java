package com.co.ceiba.adn.domain;



import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import com.co.ceiba.adn.domain.builder.ProductDtoTestDataBuilder;
import com.co.ceiba.adn.domain.builder.ProductTestDataBuilder;
import com.co.ceiba.adn.domain.builder.SalesHeaderDtoTestDataBuilder;
import com.co.ceiba.adn.domain.exceptions.FieldEmptyOrNullException;
import com.co.ceiba.adn.domain.exceptions.FieldLengthException;
import com.co.ceiba.adn.domain.model.dto.ProductDto;
import com.co.ceiba.adn.domain.model.dto.SalesHeaderDto;
import com.co.ceiba.adn.domain.model.entities.Product;



public class ProductDtoTest {
	
	@Test
	public void testProductDto() {		
		ProductDtoTestDataBuilder builder = new ProductDtoTestDataBuilder();
		ProductDto product=  builder.build();
		assertNotEquals(0, product.getPrice());	
	}
	
	

}
