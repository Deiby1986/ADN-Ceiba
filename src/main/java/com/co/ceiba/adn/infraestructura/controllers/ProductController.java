package com.co.ceiba.adn.infraestructura.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.ceiba.adn.adapters.ProductAdapter;
import com.co.ceiba.adn.application.command.bean.CommandProduct;
import com.co.ceiba.adn.domain.entities.Product;
import com.co.ceiba.adn.services.ProductService;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ProductController {
	
	@Autowired
	ProductAdapter adapter;
	
	@Autowired
	ProductService service;
	
	@GetMapping("/products")
	public List<Product> getProducts(){
		return service.findAll();		
	}
	
	@PostMapping("/addProduct")
	public boolean addProduct(@RequestBody CommandProduct pr){
		return adapter.crearProducto(pr);		
	}
	
	@GetMapping("/getProduct")
	public Product getProduct(Long id){
		return service.findById(id);		
	}

}
