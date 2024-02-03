package org.generation.italy.arte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Arte")
public class MainController {

	
	@GetMapping
	public String index() {
		
		return "main/home";
	}
	
	
}
