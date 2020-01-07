package com.co.ceiba.adn.domain;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.co.ceiba.adn.domain.builder.SalesDetailTestDataBuilder;
import com.co.ceiba.adn.domain.builder.SalesHeaderDtoTestDataBuilder;
import com.co.ceiba.adn.domain.builder.SalesHeaderTestDataBuilder;
import com.co.ceiba.adn.domain.exceptions.FieldEmptyOrNullException;
import com.co.ceiba.adn.domain.model.dto.SalesHeaderDto;
import com.co.ceiba.adn.domain.model.dto.conversion.SalesHeaderDtoConversion;
import com.co.ceiba.adn.domain.model.entities.SalesDetail;
import com.co.ceiba.adn.domain.model.entities.SalesHeader;

public class SalesHeaderDtoTest {
	
	@Test
	public void testSalesHeaderDto() {
		SalesHeaderDtoTestDataBuilder builder = new SalesHeaderDtoTestDataBuilder();		
		SalesHeaderDto header=  builder.withName("test").withTotal(1D).withDate("01/01/2019").build();		
		assertNotEquals(0, header.getTotal());
	}
	
	@Test
	public void TestSalesHeaderConversion() {
		List<SalesDetail> details = new ArrayList<SalesDetail>();
		details.add(new SalesDetailTestDataBuilder().build());
		SalesHeader header = new SalesHeaderTestDataBuilder().withDetails(details).build();
	    
		SalesHeaderDto  headerDto = SalesHeaderDtoConversion.convertToDto(header);
		assertEquals(header.getDetails().size(), headerDto.getDetails().size());
		
	}
	
	

}
