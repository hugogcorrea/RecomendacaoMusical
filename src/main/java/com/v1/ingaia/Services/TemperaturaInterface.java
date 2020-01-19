package com.v1.ingaia.Services;

import com.v1.ingaia.Exceptions.CityNotFound;

public interface TemperaturaInterface {
	
	Double buscarTemperturaCidade(String cidadePais) throws CityNotFound;
}
