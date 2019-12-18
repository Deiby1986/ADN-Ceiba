package com.co.ceiba.adn.domain.builder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.co.ceiba.adn.domain.model.dto.SalesHeaderDto;

public class SalesHeaderDtoTestDataBuilder {
	private Long id;	
	private String clientName;	
	private String date;	
	private Double total;
	
	public SalesHeaderDtoTestDataBuilder() {
		this.id = 1L;
		this.clientName="Cliente compra";
		this.date = LocalDate.of(2019, 12, 03).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		this.total = 200.5D;
	}
	
	public SalesHeaderDtoTestDataBuilder withName(String name) {
		this.clientName = name;
		return this;
	}
	
	public SalesHeaderDtoTestDataBuilder withDate(String date) {
		this.date = date;
		return this;
	}
	
	public SalesHeaderDtoTestDataBuilder withTotal(String date) {
		this.date = date;
		return this;
	}
	
	public SalesHeaderDto build() {
		return new SalesHeaderDto(id,clientName, date, total);
	}

}
