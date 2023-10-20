package com.armando.SaveTravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.armando.SaveTravels.models.Travel;
import com.armando.SaveTravels.repositories.TravelRepo;

@Service
public class TravelService {
	private final TravelRepo travelRepo;
	
	public TravelService(TravelRepo travelRepo) {
		this.travelRepo = travelRepo;
	}
	
	public List<Travel> allTravel() {
		return travelRepo.findAll();
	}
	
	public Travel createTravel(Travel travel) {
		return travelRepo.save(travel);
	}
	
	public Travel findTravel(Long id) {
		Optional<Travel> optionTravel = travelRepo.findById(id);
		if(optionTravel.isPresent()) {
			return optionTravel.get();
		}
		return null;
	}
	
	public Travel updateTravel(Travel travel) {
		return travelRepo.save(travel);
	}
	
	public void deleteTravel(Travel travel) {
		travelRepo.delete(travel);
	}
}
