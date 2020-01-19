package com.v1.ingaia.Services;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.credentials.ClientCredentials;
import com.wrapper.spotify.requests.authorization.client_credentials.ClientCredentialsRequest;

@Service
public class GeraTokenSpotify implements GeraTokenSpotifyInterface {

	private static final String clientId = "4c0d5b38a0e6411fa13ca4d16c03ccf9";
	private static final String clientSecret = "9357774fb28f48acb91f8e76baf18357";
	private static final SpotifyApi spotifyApi = new SpotifyApi.Builder()
			.setClientId(clientId)
			.setClientSecret(clientSecret)
			.build();
	private static final ClientCredentialsRequest clientCredentialsRequest = spotifyApi.clientCredentials().build();

	
	@Override
	public String GerarToken() {
		try {
			final ClientCredentials clientCredentials = clientCredentialsRequest.execute();
			return clientCredentials.getAccessToken();
		} catch (IOException | SpotifyWebApiException e) {
			return e.getMessage();
		}
	}

}
