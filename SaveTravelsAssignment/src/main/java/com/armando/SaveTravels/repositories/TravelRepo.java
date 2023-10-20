package com.armando.SaveTravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.armando.SaveTravels.models.Travel;

public interface TravelRepo extends CrudRepository<Travel, Long>{
	List<Travel> findAll();

}
