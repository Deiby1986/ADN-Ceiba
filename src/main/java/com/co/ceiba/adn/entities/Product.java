package com.co.ceiba.adn.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class Product implements Serializable {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "codigo",  length = 20,nullable = false)
	private String codigo;
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "qty", nullable = false)
	private Long qty;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getQty() {
		return qty;
	}

	public void setQty(Long qty) {
		this.qty = qty;
	}

}
