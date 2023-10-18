package com.armando.Burger.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.armando.Burger.models.Burger;

public interface BurgerRepo extends CrudRepository<Burger, Long> {
	
	//retrieves all burgers
	List<Burger> findAll();
}
