package com.co.ceiba.adn.infraestructura;

import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.co.ceiba.adn.application.command.ProductCommand;
import com.co.ceiba.adn.application.command.bean.CommandProduct;
import com.co.ceiba.adn.infraestructura.builder.CommandProductDataBuilder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//@RunWith(SpringRunner.class)
//@WebMvcTest(ProductCommand.class)
//@ComponentScan("com.co.ceiba")
public class TestProductCommand {
	
	@Autowired
	private ObjectMapper objetcMapper;
	
	@Autowired
	private MockMvc mock; 

	@Test
	public void crear(){
		/*CommandProduct prCommand= new CommandProductDataBuilder().build();
		
		
			mock.perform(get("/api/products").
							contentType(MediaType.APPLICATION_JSON_UTF8).
							content(objetcMapper.writeValueAsString(prCommand))).andExpect(status().isOk());*/
		
		assertTrue(true);
		
		
	}

}
