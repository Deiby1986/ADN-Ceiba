package com.co.ceiba.adn.infraestructura.builder;

import java.util.ArrayList;
import java.util.List;

import com.co.ceiba.adn.application.command.bean.CommandSalesDetail;

public class CommandSalesDetailDataBuilder {
	
	private Long id;	
	private Long  idHeader;
	private Long  idProduct;	
	private Long qtyPurchased;	
	private Long total;	
	
	public CommandSalesDetailDataBuilder() {
		this.id = 1L;
		this.idHeader = 1L;
		this.idProduct = 1L;
		this.qtyPurchased = 1L;
		this.idProduct = 1L;
		this.total = 1L;
	}
	
	
	public CommandSalesDetailDataBuilder withId(Long id) {
		this.id = id;
		return this;
	}
	
	public CommandSalesDetailDataBuilder withIdHeader(Long id) {
		this.idHeader = id;
		return this;
	}
	
	public CommandSalesDetailDataBuilder withIdProduct(Long id) {
		this.idProduct = id;
		return this;
	}
	
	public CommandSalesDetailDataBuilder withQtyPruchased(Long qty) {
		this.qtyPurchased = qty;
		return this;
	}
	
	public CommandSalesDetailDataBuilder withTotal(Long total) {
		this.total = total;
		return this;
	}
	
	public List<CommandSalesDetail> build(){
		ArrayList<CommandSalesDetail> list = new ArrayList<CommandSalesDetail>();
		list.add(new CommandSalesDetail(idHeader, idProduct, qtyPurchased, total));
		return list;
	}
	
}
