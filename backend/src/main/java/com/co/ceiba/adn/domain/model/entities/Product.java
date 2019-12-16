package com.co.ceiba.adn.domain.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

import com.co.ceiba.adn.domain.exceptions.FieldEmptyOrNullException;
import com.co.ceiba.adn.domain.exceptions.FieldLengthException;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Products")
@NamedNativeQuery(name = "Product.findByCode", query = "SELECT * FROM products WHERE codigo = ?", resultClass = Product.class)
public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "codigo",  length = 20,nullable = false)
	private String codigo;
	@Column(name = "nombre", nullable = false)
	private String nombre;
	@Column(name = "price", nullable = false)
	private Double price;
	@Column(name = "qty", nullable = false)
	private Long qty;
	
	public Product() {
	
	}

	public Product(String codigo, String name, Long qty,Double price) {
		super();
		if(codigo == null || codigo.trim().length() == 0)
			throw new FieldEmptyOrNullException("Codigo del producto no puede ser vacio");
		if(name == null || name.trim().length() == 0)
			throw new FieldEmptyOrNullException("Nombre del producto no puede ser vacio");	
		if(codigo.length()<5)
			throw new FieldLengthException("Longitud del codigo no puede ser menor que 5");
		if(name.length()<5)
			throw new FieldLengthException("Longitud del nombre no puede ser menor que 5");
		this.codigo = codigo;
		this.nombre = name;
		this.qty = qty;
		this.price = price;
	}

	

	

}
