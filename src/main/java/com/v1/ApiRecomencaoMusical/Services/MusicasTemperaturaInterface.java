package com.v1.ApiRecomencaoMusical.Services;

import java.util.List;

import com.v1.ApiRecomencaoMusical.Exceptions.CityNotFound;

public interface MusicasTemperaturaInterface {

	List<String> buscarMusicasPorTemperatura(String cidadePais) throws CityNotFound;
}
