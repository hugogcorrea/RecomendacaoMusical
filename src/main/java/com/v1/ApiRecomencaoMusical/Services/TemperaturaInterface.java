package com.v1.ApiRecomencaoMusical.Services;

import com.v1.ApiRecomencaoMusical.Exceptions.CityNotFound;

public interface TemperaturaInterface {
	
	Double buscarTemperturaCidade(String cidadePais) throws CityNotFound;
}
