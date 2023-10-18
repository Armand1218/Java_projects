package com.armando.Burger.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.armando.Burger.models.Burger;
import com.armando.Burger.services.BurgerService;

@RestController
public class BurgerApi {
	private final BurgerService burgerService;
	
	public BurgerApi(BurgerService burgerService) {
		this.burgerService = burgerService;
	}
	
	@RequestMapping("/api/burgers")
	public List<Burger> index(){
		return burgerService.allBurger();
	}
}