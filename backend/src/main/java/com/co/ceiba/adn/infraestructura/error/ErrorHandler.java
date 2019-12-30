package com.co.ceiba.adn.infraestructura.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ErrorHandler extends ResponseEntityExceptionHandler {
	
	public ErrorHandler() {
		System.out.println("Manejador error");
	}
	
	@ExceptionHandler(Exception.class)
    public final ResponseEntity<Error> handleAllException(Exception exception){
		return new ResponseEntity<>(new Error(exception.getClass().getSimpleName(),exception.getMessage()),HttpStatus.BAD_REQUEST);
		
	}

}
