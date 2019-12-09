package com.co.ceiba.adn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.co.ceiba.adn.entities.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Long> {

}
