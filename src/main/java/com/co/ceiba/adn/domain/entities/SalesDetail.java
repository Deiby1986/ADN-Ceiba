package com.co.ceiba.adn.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SalesDetail")
public class SalesDetail {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_salesheader", nullable = false)
	private SalesHeader header;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_producto", nullable = false)
	private Product product;
	
	private Long qtyPurchased;
	
	private Long total;

	public SalesDetail(SalesHeader header, Product product, Long qtyPurchased, Long total) {
		super();
		this.header = header;
		this.product = product;
		this.qtyPurchased = qtyPurchased;
		this.total = total;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SalesHeader getHeader() {
		return header;
	}

	public void setHeader(SalesHeader header) {
		this.header = header;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
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
