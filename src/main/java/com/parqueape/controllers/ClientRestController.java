package com.parqueape.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parqueape.models.Garage;
import com.parqueape.services.GarageService;

@RestController
@RequestMapping("/api")
public class ClientRestController {
	
	@Autowired
	private GarageService garageService;
	
	@GetMapping("/hola")
	public String data() {
		return "Hola Mundo";
	}
	
	@GetMapping("/garages")
	public List<Garage> garages() {
		return garageService.garages();
	}
	
	@GetMapping("/garage/{id}")
	public Optional<Garage> garage(@PathVariable("id") String id) {
		Long garageId = Long.parseLong(id);
		return garageService.findGarage(garageId);
	}

}
