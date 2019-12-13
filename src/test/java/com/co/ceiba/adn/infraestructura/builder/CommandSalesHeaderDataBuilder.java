package com.co.ceiba.adn.infraestructura.builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.co.ceiba.adn.application.command.bean.CommandSalesDetail;
import com.co.ceiba.adn.application.command.bean.CommandSalesHeader;

public class CommandSalesHeaderDataBuilder {
	
	private Long id;
	private String nombreCliente;
	private String date;	
	private Double total;
	List<CommandSalesDetail> detalles;
	
	public CommandSalesHeaderDataBuilder() {
		this.nombreCliente = "Cliente prueba";
		this.date = LocalDate.of(2019, 01, 01).toString();
		this.total = 100D;
		CommandSalesDetail detail = new CommandSalesDetail(0L, 1L, 1L, 100L);
		this.detalles = new ArrayList<>();
		this.detalles.add(detail);
		
	}
	
	public CommandSalesHeaderDataBuilder withName(String name) {
		this.nombreCliente = name;
		return this;
	}
	
	public CommandSalesHeaderDataBuilder withDate(Double total) {
		this.total = total;
		return this;
	}
	
	public CommandSalesHeaderDataBuilder withTotal(String date) {
		this.date = date;
		return this;
	}
	
	public CommandSalesHeaderDataBuilder withDetail(CommandSalesDetail detail) {
		this.detalles.clear();
		if(detail!=null)
			this.detalles.add(detail);
		return this;
	}
	
	public CommandSalesHeader build() {		
		return new CommandSalesHeader(0L, nombreCliente, date, total, detalles);
	}

}
