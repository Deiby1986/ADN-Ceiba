package com.co.ceiba.adn.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.ceiba.adn.entities.Product;
import com.co.ceiba.adn.services.ProductService;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping("/productos")
	public List<Product> getProducts(){
		return service.findAll();		
	}
	
	@GetMapping("/addProduct")
	public Product addProduct(Product pr){
		return service.save(pr);		
	}
	
	@GetMapping("/getProduct")
	public Product getProduct(Long id){
		return service.findById(id);		
	}

}
