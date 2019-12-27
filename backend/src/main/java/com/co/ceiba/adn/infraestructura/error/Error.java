package com.co.ceiba.adn.infraestructura.error;

public class Error {
    
    private String excepcionName;
    private String message;
    
    
	public Error(String excepcionName, String message) {
		this.excepcionName = excepcionName;
		this.message = message;
	}


	public String getExcepcionName() {
		return excepcionName;
	}


	public void setExcepcionName(String excepcionName) {
		this.excepcionName = excepcionName;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
    
    

}
