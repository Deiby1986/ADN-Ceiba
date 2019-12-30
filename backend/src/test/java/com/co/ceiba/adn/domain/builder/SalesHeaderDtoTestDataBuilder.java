package com.co.ceiba.adn.domain.builder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.co.ceiba.adn.domain.model.dto.SalesDetailDto;
import com.co.ceiba.adn.domain.model.dto.SalesHeaderDto;

public class SalesHeaderDtoTestDataBuilder {
	private Long id;	
	private String clientName;	
	private String date;	
	private Double total;
	private List<SalesDetailDto> details;
	
	public SalesHeaderDtoTestDataBuilder() {
		this.id = 1L;
		this.clientName="Cliente compra";
		this.date = LocalDate.of(2019, 12, 03).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		this.total = 200.5D;
		this.details = new ArrayList<SalesDetailDto>();
		this.details.add(new SalesDetailDto(1L, 1L, "Prueba", 1L, 1D, 1L));
	}
	
	public SalesHeaderDtoTestDataBuilder withName(String name) {
		this.clientName = name;
		return this;
	}
	
	public SalesHeaderDtoTestDataBuilder withDate(String date) {
		this.date = date;
		return this;
	}
	
	public SalesHeaderDtoTestDataBuilder withTotal(Double total) {
		this.total = total;
		return this;
	}
	
	public SalesHeaderDtoTestDataBuilder withDetails(List<SalesDetailDto> details) {
		this.details  = new ArrayList<>(details);
		return this;
	}
	
	public SalesHeaderDto build() {
		return new SalesHeaderDto(id,clientName, date, total);
	}

}
