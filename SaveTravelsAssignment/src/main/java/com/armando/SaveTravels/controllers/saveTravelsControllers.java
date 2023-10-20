package com.armando.SaveTravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.armando.SaveTravels.models.Travel;
import com.armando.SaveTravels.services.TravelService;

@Controller
public class saveTravelsControllers {
	
	@Autowired
	TravelService travelService;
	
	@GetMapping("/")
	public String dashboard(@ModelAttribute("travel")Travel travel, Model model) {
		List<Travel> travels = travelService.allTravel();
		model.addAttribute("travels", travels);
		return "index.jsp";
	}
	
	@PostMapping("/addTravel")
	public String dashboard(@Valid @ModelAttribute("travels")Travel travel, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Travel> travels = travelService.allTravel();
			model.addAttribute("travels", travels);
			return "index.jsp";
	}
	travelService.createTravel(travel);
	return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, @ModelAttribute("travel")Travel travel, Model model) {
		model.addAttribute("travel", travelService.findTravel(id));
		return "edit.jsp";
	}
	
	@PostMapping("/edit/{id}")
	public String update(@Valid @ModelAttribute("travel")Travel travel, BindingResult result, @PathVariable("id")Long id, Model model) {
	if(result.hasErrors()) {
		model.addAttribute("travel", travel);
		return "edit.jsp";
	}
	travelService.updateTravel(travel);
	return "redirect:/";
	}
	
	@GetMapping("/show/{id}")
	public String showTravel(@PathVariable("id") Long id, Model model) {
		model.addAttribute("travel", travelService.findTravel(id));
		return "show.jsp";
	}
	
	@RequestMapping("/travel/delete/{id}")
	public String deleteTravel(@PathVariable("id") Long id) {
		Travel travel = travelService.findTravel(id);
		travelService.deleteTravel(travel);
		return "redirect:/";
	}
}