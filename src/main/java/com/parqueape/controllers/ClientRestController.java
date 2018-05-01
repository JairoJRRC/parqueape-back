package com.parqueape.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClientRestController {
	
	@GetMapping("/hola")
	public String data() {
		return "Hola Mundo";
	}

}
