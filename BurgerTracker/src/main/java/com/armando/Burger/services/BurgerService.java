package com.armando.Burger.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.armando.Burger.models.Burger;
import com.armando.Burger.repositories.BurgerRepo;

@Service
public class BurgerService {
	private final BurgerRepo burgerRepo;
	
	public BurgerService(BurgerRepo burgerRepo) {
		this.burgerRepo = burgerRepo;
	}
	
	public List<Burger> allBurger() {
		return burgerRepo.findAll();
	}
	
	public Burger createBurger(Burger burger) {
		return burgerRepo.save(burger);
	}

	public Burger findBurger(Long id) {
		Optional<Burger> optionBurger = burgerRepo.findById(id);
		if(optionBurger.isPresent()) {
			return optionBurger.get();
		}
		return null;
	}
	
	public Burger updateBurger(Burger burger) {
		return burgerRepo.save(burger);
	}
}
