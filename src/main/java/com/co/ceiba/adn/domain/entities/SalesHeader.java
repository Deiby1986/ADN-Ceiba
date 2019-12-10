package com.co.ceiba.adn.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	private String nombreCliente;
	@Column(name = "fecha", nullable = false)
	private String fecha;
	@Column(name = "total", nullable = false)
	private Double total;
	
	
	public SalesHeader(String nombreCliente, String fecha, Double total) {
		super();
		this.nombreCliente = nombreCliente;
		this.fecha = fecha;
		this.total = total;
	}

}
