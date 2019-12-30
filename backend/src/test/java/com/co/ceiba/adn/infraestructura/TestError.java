package com.co.ceiba.adn.infraestructura;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.co.ceiba.adn.infraestructura.error.Error;

public class TestError {
	
	@Test
	public void testErrorClass() {
		Error error = new Error("ErrorTest", "Error descripcion");
		assertEquals("ErrorTest", error.getExcepcionName());
	}
	

}
