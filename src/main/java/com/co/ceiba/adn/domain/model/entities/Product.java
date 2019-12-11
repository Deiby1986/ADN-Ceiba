package com.co.ceiba.adn.domain.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Products")
@NamedNativeQuery(name = "Product.findByCode", query = "SELECT * FROM products WHERE codigo = ?", resultClass = Product.class)
public class Product implements Serializable {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "codigo",  length = 20,nullable = false)
	private String codigo;
	@Column(name = "nombre", nullable = false)
	private String nombre;
	@Column(name = "qty", nullable = false)
	private Long qty;
	
	public Product() {
	
	}

	public Product(String codigo, String name, Long qty) {
		super();
		this.codigo = codigo;
		this.nombre = name;
		this.qty = qty;
	}

	

	

}
