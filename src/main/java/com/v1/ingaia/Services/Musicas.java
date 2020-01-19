package com.v1.ingaia.Services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.v1.ingaia.models.Spotify_Recomendation;
import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Recommendations;
import com.wrapper.spotify.requests.data.browse.GetRecommendationsRequest;

@Service
public class Musicas implements MusicasInterface {

	@Autowired
	GeraTokenSpotifyInterface geraToken;

	@Override
	public List<String> buscarMusicasPorGenero(String genero) {
		List<String> retorno = new ArrayList<String>();
		try {
			SpotifyApi spotifyApi = new SpotifyApi.Builder().setAccessToken(geraToken.GerarToken()).build();
			
			
			final GetRecommendationsRequest getRecommendationsRequest = spotifyApi
					.getRecommendations()
					.seed_genres(genero).build();
			final Recommendations recommendations = getRecommendationsRequest.execute();

			ObjectMapper mapper = new ObjectMapper();
			String jsonString = mapper.writeValueAsString(recommendations);
			Gson g = new Gson();
			Spotify_Recomendation recomendation = g.fromJson(jsonString, Spotify_Recomendation.class);			
			
			retorno = recomendation.getTracks().stream()
					.map(x -> x.getName())
					.collect(Collectors.toList());
			
		} catch (IOException | SpotifyWebApiException e) {
			System.out.println(e.getMessage());
		}
		return retorno;
	}

}
