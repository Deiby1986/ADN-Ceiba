package com.co.ceiba.adn.domain.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.co.ceiba.adn.domain.exceptions.FieldEmptyOrNullException;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
		if(header == null)
			throw new FieldEmptyOrNullException("Se debe especificar el header");
		if(product == null)
			throw new FieldEmptyOrNullException("Se debe especificar el producto");
		if(qtyPurchased == null || qtyPurchased <= 0L)
			throw new FieldEmptyOrNullException("Se debe especificar una cantidad valida");
		if(total <= 0L)
			throw new FieldEmptyOrNullException("Se debe ingresar una cantidad valida");
		
		this.header = header;
		this.product = product;
		this.qtyPurchased = qtyPurchased;
		this.total = total;
	}
	
	

	
	
	

}
