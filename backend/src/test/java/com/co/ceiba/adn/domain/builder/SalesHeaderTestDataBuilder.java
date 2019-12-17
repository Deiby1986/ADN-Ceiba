package com.co.ceiba.adn.domain.builder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.co.ceiba.adn.domain.model.entities.SalesHeader;

public class SalesHeaderTestDataBuilder {
	private Long id;	
	private String clientName;	
	private String date;	
	private Double total;
	
	public SalesHeaderTestDataBuilder() {
		this.id = 1L;
		this.clientName="Cliente compra";
		this.date = LocalDate.of(2019, 12, 03).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		this.total = 200.5D;
	}
	
	public SalesHeaderTestDataBuilder withName(String name) {
		this.clientName = name;
		return this;
	}
	
	public SalesHeaderTestDataBuilder withDate(String date) {
		this.date = date;
		return this;
	}
	
	public SalesHeaderTestDataBuilder withTotal(String date) {
		this.date = date;
		return this;
	}
	
	public SalesHeader build() {
		return new SalesHeader(clientName, date, total);
	}


}
