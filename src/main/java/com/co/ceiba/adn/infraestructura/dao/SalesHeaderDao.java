package com.co.ceiba.adn.infraestructura.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.co.ceiba.adn.domain.model.entities.SalesHeader;



public interface SalesHeaderDao extends JpaRepository<SalesHeader, Long>{

}
