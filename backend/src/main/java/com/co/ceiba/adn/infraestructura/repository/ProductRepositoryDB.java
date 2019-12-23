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
	
	
	ProductDao productRepository;	

	public ProductRepositoryDB(ProductDao productRepository) {
		this.productRepository = productRepository;
	}	

	@Override
	public List<ProductDto> findAllAsDto() {
		return productRepository.findAll().stream().map(product -> new ProductDto(product.getId(),product.getCodigo(),product.getNombre(),product.getPrice() ,product.getQty()))
				 .collect(Collectors.toList());
	}
	

	@Override
	public Product findByCode(String code) {		
		return productRepository.findByCode(code);
	}	
	

	@Override
	public Product save(Product product) {
		return productRepository.save(product);
	}

	

}
