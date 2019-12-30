package com.co.ceiba.adn.domain.exceptions;

public class NoStockAvailableForProduct extends RuntimeException{
	
	public NoStockAvailableForProduct(String message) {
		super(message);
	}

}
