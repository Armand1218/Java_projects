package com.armando.DojoAndNinja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.armando.DojoAndNinja.model.Dojo;
import com.armando.DojoAndNinja.model.Ninja;
import com.armando.DojoAndNinja.repositories.DojoRepository;
import com.armando.DojoAndNinja.repositories.NinjaRepository;

@Service
public class AssignmentService {
	@Autowired
	private NinjaRepository ninjaRepo;
	@Autowired
	private DojoRepository dojoRepo;
	
	public List<Dojo> allDojos() {
		return this.dojoRepo.findAll();	
		}
	
	public Dojo addDojo(Dojo dojo) {
		return this.dojoRepo.save(dojo);
	}
	
	public Ninja addNinja(Ninja ninja) {
		return this.ninjaRepo.save(ninja);
	}
	
	public Dojo getADojo(Long id) {
		return this.dojoRepo.findById(id).orElse(null);
	}
}
