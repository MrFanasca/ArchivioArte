package org.generation.italy.arte.controller;

import org.generation.italy.arte.repository.ArtistaReopository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Artista")
public class ArtistaController {

	@Autowired
	ArtistaReopository artistaRepository;
	
	@GetMapping()
	public String index () {
		
		return "artista/home";
	}
}
