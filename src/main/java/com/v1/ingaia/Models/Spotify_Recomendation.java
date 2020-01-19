package com.v1.ingaia.Models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Spotify_Recomendation {

	List<Spotify_Tracks> tracks;
}
