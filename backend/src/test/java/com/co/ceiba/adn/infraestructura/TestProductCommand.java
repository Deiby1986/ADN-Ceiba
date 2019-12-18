package com.co.ceiba.adn.infraestructura;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.co.ceiba.adn.App;
import com.co.ceiba.adn.application.command.bean.CommandProduct;
import com.co.ceiba.adn.infraestructura.builder.CommandProductDataBuilder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
classes = App.class)
@AutoConfigureMockMvc
public class TestProductCommand {
	
	@Autowired
	private ObjectMapper objetcMapper;
	
	@Autowired
	private WebApplicationContext wac;

	@Autowired
	private MockMvc mockMvc;

	@Before
	public void setUp(){
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	@Test
	public void createProduct() throws JsonProcessingException, Exception{
		CommandProduct prCommand= new CommandProductDataBuilder().build();		
		
		mockMvc.perform(post("/api/products").
							contentType(MediaType.APPLICATION_JSON).
							content(objetcMapper.writeValueAsString(prCommand))).andExpect(status().isOk());
		
		
	}
	
	@Test
	public void listProducts() throws JsonProcessingException, Exception{
		CommandProduct prCommand= new CommandProductDataBuilder().build();		
		
		mockMvc.perform(get("/api/products").
							contentType(MediaType.APPLICATION_JSON).
							content(objetcMapper.writeValueAsString(prCommand))).andExpect(status().isOk());
		
		
	}
	
	
	

}
