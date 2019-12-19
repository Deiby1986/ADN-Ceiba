package com.co.ceiba.adn.infraestructura.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.co.ceiba.adn.domain.model.entities.SalesDetail;

public interface SalesDetailDao extends JpaRepository<SalesDetail, Long>{
   public List<SalesDetail> findAllForHeaderId(Long id);
}
