package com.v1.ingaia.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.v1.ingaia.Models.Weather;

@Service
public class Temperatura implements TemperaturaInterface{

	private static final String KEY = "89c0e7514cc9060676ab1152eebd77b8";
	private final Double TEMP_KELVIN_TO_CELSIUS = 273.15;
	
	public Double buscarTemperturaCidade(final String cidadePais) {
		RestTemplate restTemplate = new RestTemplate();
		
		UriComponents uri = UriComponentsBuilder
				.newInstance()
				.scheme("http")
				.host("api.openweathermap.org")
				.path("data/2.5/weather")
				.queryParam("q=" + cidadePais + "&APPID=" + KEY)
				.build();

		Weather objeto = restTemplate.getForObject(uri.toString(), Weather.class);
		
		return objeto.getMain().getTemp() - TEMP_KELVIN_TO_CELSIUS;
	}

}
