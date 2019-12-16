package com.co.ceiba.adn.infraestructura.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.co.ceiba.adn.domain.model.dto.ProductDto;
import com.co.ceiba.adn.domain.model.entities.Product;
import com.co.ceiba.adn.domain.repository.ProductRepository;
import com.co.ceiba.adn.infraestructura.dao.ProductDao;

@Component
public class ProductRepositoryDB implements ProductRepository {	
	
	
	ProductDao rep;	

	public ProductRepositoryDB(ProductDao rep) {
		super();
		this.rep = rep;
	}

	@Override
	public List<Product> findAll() {
		return rep.findAll();
	}

	@Override
	public List<ProductDto> findAllAsDto() {
		return rep.findAll().stream().map(product -> new ProductDto(product.getId(),product.getCodigo(),product.getNombre(),product.getPrice() ,product.getQty()))
				 .collect(Collectors.toList());
	}
	

	@Override
	public Product findByCode(String code) {		
		return rep.findByCode(code);
	}

	@Override
	public Product findById(Long id) {
		return rep.findById(id).orElse(null);
	}	
	

	@Override
	public Product save(Product p) {
		return rep.save(p);
	}

	

}
