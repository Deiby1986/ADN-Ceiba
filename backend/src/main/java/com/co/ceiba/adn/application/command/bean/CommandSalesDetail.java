package com.co.ceiba.adn.application.command.bean;

public class CommandSalesDetail {
	
	private Long id;	
	private Long  idHeader;
	private Long  idProduct;	
	private Long qtyPurchased;	
	private Long total;	
	
	public CommandSalesDetail(Long idHeader, Long idProduct, Long qtyPurchased, Long total) {		
		this.idHeader = idHeader;
		this.idProduct = idProduct;
		this.qtyPurchased = qtyPurchased;
		this.total = total;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdHeader() {
		return idHeader;
	}

	public void setIdHeader(Long idHeader) {
		this.idHeader = idHeader;
	}

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public Long getQtyPurchased() {
		return qtyPurchased;
	}

	public void setQtyPurchased(Long qtyPurchased) {
		this.qtyPurchased = qtyPurchased;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	
	
	
	

}
