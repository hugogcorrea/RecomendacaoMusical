package com.v1.ingaia.Services;

import java.util.List;

import com.v1.ingaia.Exceptions.CityNotFound;

public interface MusicasTemperaturaInterface {

	List<String> buscarMusicasPorTemperatura(String cidadePais) throws CityNotFound;
}
