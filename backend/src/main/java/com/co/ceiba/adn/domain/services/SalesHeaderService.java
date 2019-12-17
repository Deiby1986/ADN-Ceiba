package com.co.ceiba.adn.domain.services;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

import javax.swing.text.DateFormatter;

import com.co.ceiba.adn.domain.exceptions.CanSellOnWekendsException;
import com.co.ceiba.adn.domain.exceptions.InvalidDateException;
import com.co.ceiba.adn.domain.model.entities.SalesHeader;
import com.co.ceiba.adn.domain.repository.SalesHeaderRepository;

public class SalesHeaderService {
	
	private SalesHeaderRepository repository;

	public SalesHeaderService(SalesHeaderRepository repository) {
		super();
		this.repository = repository;
	}
	
	public SalesHeader execute(SalesHeader header) {
		if(!DateFormatCorrect(header.getDate()))
			throw new InvalidDateException("Especifique la fecha en formato dd/mm/yyyy");
		if(!canSale(header))
			throw new CanSellOnWekendsException("No se puede vender los fines de semana");
		return repository.save(header);
	}
	
	public boolean canSale(SalesHeader header) {
		String stringDate = header.getDate();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(stringDate, formatter);
		if(date.getDayOfWeek() ==DayOfWeek.SATURDAY || date.getDayOfWeek()== DayOfWeek.SUNDAY)
			return false;
		return true;		
	}
	
	public boolean DateFormatCorrect(String date) {
		String regexp = "\\d{1,2}/\\d{1,2}/\\d{4}";
		return Pattern.matches(regexp, date);		
	}

}
