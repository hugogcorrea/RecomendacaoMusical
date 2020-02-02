package com.v1.ingaia.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.v1.ingaia.Exceptions.CityNotFound;
import com.v1.ingaia.Services.Musicas;
import com.v1.ingaia.Services.MusicasTemperatura;
import com.v1.ingaia.Services.Temperatura;

@RestController
public class Controller {

	@Autowired
	Temperatura requisicaoTemperatura;

	@Autowired
	Musicas pesquisarMusicas;

	@Autowired
	MusicasTemperatura musicasPorTemperatura;
	
	@GetMapping("/teste")
	public ResponseEntity<String> teste(){		
			

	@GetMapping("/temperatura/{cidadePais}")
	public ResponseEntity<String> getTemperaturaByCity(@PathVariable("cidadePais") String cidadePais)
			throws CityNotFound {
		int temperatura =  (int)Math.round(requisicaoTemperatura.buscarTemperturaCidade(cidadePais));		
		return ResponseEntity.ok().body(temperatura + "ºC");
	}

	@GetMapping("/pesquisa/{genero}")
	public ResponseEntity<List<String>> Teste(@PathVariable("genero") String genero) {
		return ResponseEntity.ok().body(pesquisarMusicas.buscarMusicasPorGenero(genero));
	}

	@GetMapping("/recomendacao/{cidadePais}")
	public ResponseEntity<List<String>> BuscasRecomendacao(@PathVariable("cidadePais") String cidadePais)
			throws CityNotFound {
		return ResponseEntity.ok().body(musicasPorTemperatura.buscarMusicasPorTemperatura(cidadePais));
	}
}
