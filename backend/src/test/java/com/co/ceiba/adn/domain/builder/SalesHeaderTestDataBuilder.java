package com.co.ceiba.adn.domain.builder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.co.ceiba.adn.domain.model.entities.SalesDetail;
import com.co.ceiba.adn.domain.model.entities.SalesHeader;

public class SalesHeaderTestDataBuilder {
	private Long id;	
	private String clientName;	
	private String date;	
	private Double total;
	private List<SalesDetail> details;
	
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
	
	public SalesHeaderTestDataBuilder withTotal(Double total) {
		this.total = total;
		return this;
	}
	
	public SalesHeaderTestDataBuilder withDetails(List<SalesDetail> details) {
		this.details = details;
		return this;
	}
	
	public SalesHeader build() {
		SalesHeader header = new SalesHeader(clientName, date, total);
		if(details!=null)
			header.setDetails(details);
		return header;
	}


}
