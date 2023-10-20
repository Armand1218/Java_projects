package com.armando.SaveTravels.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.armando.SaveTravels.models.Travel;
import com.armando.SaveTravels.services.TravelService;

@RestController
public class TravelApi {
	private final TravelService travelService;
	
	public TravelApi(TravelService travelService) {
		this.travelService = travelService;
	}
	
	@RequestMapping("/api/travels")
	public List<Travel> index(){
		return travelService.allTravel();
	}
}
