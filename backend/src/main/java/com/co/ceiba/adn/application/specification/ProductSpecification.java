package com.co.ceiba.adn.application.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.co.ceiba.adn.domain.model.entities.Product;
import com.mysql.cj.x.protobuf.MysqlxCrud.Column;

public class ProductSpecification implements Specification<Product> {
	
	
	private static final long serialVersionUID = 1L;
	
	private String columnName;
	

	
	public ProductSpecification(String columnName) {
		this.columnName = columnName;
	}
	
	@Override
	public Predicate toPredicate(Root<Product> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		 if (this.columnName == null) {
             return criteriaBuilder.isTrue(criteriaBuilder.literal(true)); // always true = no filtering
         }
         return criteriaBuilder.equal(root.get(this.columnName), this.columnName);
	}

	


}
