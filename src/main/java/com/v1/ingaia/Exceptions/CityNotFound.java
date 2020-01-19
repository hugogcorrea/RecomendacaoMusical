package com.v1.ingaia.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CityNotFound extends Exception {
	
	private static final long serialVersionUID = 1L;
	private static String MESSAGE = "Cidade não encontrada.";
	public CityNotFound() {
        super(MESSAGE);
    }
}