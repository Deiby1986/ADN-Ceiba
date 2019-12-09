package com.co.ceiba.adn.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SalesHeader")
public class SalesHeader {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre_cliente", nullable = false)
	private String nombre_cliente;
	@Column(name = "fecha", nullable = false)
	private String fecha;
	@Column(name = "total", nullable = false)
	private Double total;
	

}
