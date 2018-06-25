package com.parqueape.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.parqueape.models.Garage;
import com.parqueape.repository.GarageRepository;

@Service
public class GarageService {
	
	@Autowired
	private GarageRepository garageRepository;
	
	public List<Garage> garages(){
		return (List<Garage>) garageRepository.findAll();
	}
	
	public Optional<Garage> findGarage(Long id){
		return garageRepository.findById(id);
	}

}
