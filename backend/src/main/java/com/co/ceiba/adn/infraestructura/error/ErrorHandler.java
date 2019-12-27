package com.co.ceiba.adn.infraestructura.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ErrorHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(Exception.class)
    public final ResponseEntity<Error> handleAllException(Exception exception){
		return new ResponseEntity<>(new Error(exception.getMessage(),exception.getClass().getSimpleName()),HttpStatus.BAD_REQUEST);
		
	}

}
