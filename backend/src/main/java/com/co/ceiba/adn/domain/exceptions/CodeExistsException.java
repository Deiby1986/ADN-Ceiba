package com.co.ceiba.adn.domain.exceptions;

public class CodeExistsException extends RuntimeException {
	
	
	private static final long serialVersionUID = 1L;

	public CodeExistsException() {
	    super("Codigo ya se encuentra registrado");
	}

}
