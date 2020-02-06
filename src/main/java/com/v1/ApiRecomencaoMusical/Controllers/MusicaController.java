package com.v1.ApiRecomencaoMusical.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.v1.ApiRecomencaoMusical.Services.Disco;
@Controller
public class MusicaController {

	@Autowired
	Disco disco;

	@GetMapping("/upload")
	public String form() {
		return "musicas/pesquisar";
	}

	@PostMapping("/upload")
	public String upload(@RequestParam MultipartFile arquivo) {
		disco.salvarFoto(arquivo);
		return "musicas/pesquisar";
	}

}
