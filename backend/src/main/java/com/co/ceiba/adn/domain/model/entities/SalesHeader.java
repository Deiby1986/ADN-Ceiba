package com.co.ceiba.adn.domain.model.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.co.ceiba.adn.domain.exceptions.FieldEmptyOrNullException;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "SalesHeader")
public class SalesHeader {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre_cliente", nullable = false)
	private String clientName;
	@Column(name = "fecha", nullable = false)
	private String date;
	@Column(name = "total", nullable = false)
	private Double total;
	
	@OneToMany(
	        cascade = CascadeType.ALL,
	        orphanRemoval = true,
	        fetch = FetchType.EAGER
	    )
	@JoinColumn(name = "id_salesheader")
	private List<SalesDetail> details; 
	
	public SalesHeader() {
		
	}
	public SalesHeader(String clientName, String date, Double total) {
		if(clientName == null || clientName.trim().length() == 0)
			throw new FieldEmptyOrNullException("Nombre del cliente no puede ser vacio");
		if(date == null || date.trim().length() == 0)
			throw new FieldEmptyOrNullException("Fecha de la venta no puede ser vacio");
		if(total == null || total <= 0)
			throw new FieldEmptyOrNullException("Total de la venta es invalido");
		this.clientName = clientName;
		this.date = date;
		this.total = total;
	}

}
