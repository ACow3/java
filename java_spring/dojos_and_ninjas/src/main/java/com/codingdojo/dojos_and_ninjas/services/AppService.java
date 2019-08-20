package com.codingdojo.dojos_and_ninjas.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojos_and_ninjas.models.Dojo;
import com.codingdojo.dojos_and_ninjas.models.Ninja;
import com.codingdojo.dojos_and_ninjas.repositories.DojoRepository;
import com.codingdojo.dojos_and_ninjas.repositories.NinjaRepository;

@Service
public class AppService {
	@Autowired
	DojoRepository dojoRepo;
	
	@Autowired
	NinjaRepository ninjaRepo;
	

	public void createDojo(@Valid Dojo dojo) {
		dojoRepo.save(dojo);
		
	}

	public List<Dojo> getAllDojos() {
		return (List<Dojo>) dojoRepo.findAll();
	}

	public void createNinja(@Valid Ninja ninja) {
		ninjaRepo.save(ninja);
		
	}
	
	public Dojo findOneDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepo.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		}
		return null;
	}
}