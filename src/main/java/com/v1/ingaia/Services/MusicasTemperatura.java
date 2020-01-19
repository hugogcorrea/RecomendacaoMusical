package com.v1.ingaia.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v1.ingaia.Exceptions.CityNotFound;

@Service
public class MusicasTemperatura implements MusicasTemperaturaInterface {

	@Autowired
	TemperaturaInterface requisicaoTemperatura;

	@Autowired
	MusicasInterface musicas;

	private final int TEMP_POP = 25;
	private final int TEMP_CLASSICA = 10;

	@Override
	public List<String> buscarMusicasPorTemperatura(String cidadePais) throws CityNotFound {
		// TODO Auto-generated method stub
		Double temperatura = requisicaoTemperatura.buscarTemperturaCidade(cidadePais);
		String genero;

		if (temperatura > TEMP_POP) {
			genero = "pop";
		} else if (temperatura > TEMP_CLASSICA && temperatura < TEMP_POP) {
			genero = "rock";
		} else {
			genero = "classical";
		}

		return musicas.buscarMusicasPorGenero(genero);
	}

}
