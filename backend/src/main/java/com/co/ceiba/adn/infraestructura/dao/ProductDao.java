package com.co.ceiba.adn.infraestructura.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.co.ceiba.adn.domain.model.entities.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Long> {
	
	public Product findByCode(String code);

}
