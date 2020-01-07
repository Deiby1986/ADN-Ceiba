package com.co.ceiba.adn.domain.model.dto.conversion;

import java.util.List;
import java.util.stream.Collectors;

import com.co.ceiba.adn.domain.model.dto.SalesDetailDto;
import com.co.ceiba.adn.domain.model.dto.SalesHeaderDto;
import com.co.ceiba.adn.domain.model.entities.SalesHeader;

public class SalesHeaderDtoConversion {
	
	private SalesHeaderDtoConversion() {
		
	}
	
	public static SalesHeaderDto convertToDto(SalesHeader header) {
		List<SalesDetailDto> detalles = getDetails(header);
		
		return new SalesHeaderDto(header.getId(), header.getClientName(), header.getDate(), header.getTotal(),
				detalles);
		
	}
	
	private static List<SalesDetailDto> getDetails(SalesHeader header) {
		return header.getDetails().stream().map(
				detail -> new SalesDetailDto(
						detail.getId(),
						detail.getHeader().getId(),
						detail.getProduct().getNombre(),
						detail.getQtyPurchased(),
						detail.getProduct().getPrice(),
						detail.getTotal()
						
					  ))
					  .collect(Collectors.toList());
	}

}
