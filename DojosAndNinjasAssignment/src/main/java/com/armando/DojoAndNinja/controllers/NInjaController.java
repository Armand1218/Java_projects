package com.armando.DojoAndNinja.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.armando.DojoAndNinja.model.Dojo;
import com.armando.DojoAndNinja.model.Ninja;
import com.armando.DojoAndNinja.service.AssignmentService;

@Controller
@RequestMapping("/ninja")
public class NInjaController {
	@Autowired
	private AssignmentService assignmentService;
	
	@GetMapping("/add")
	public String createNinja(@ModelAttribute("ninja")Ninja ninja, BindingResult result, Model viewModel) {
		List<Dojo> allDojos = this.assignmentService.allDojos();
		viewModel.addAttribute("allDojos", allDojos);
		return "addNinja.jsp";
	}
	
	@PostMapping("/addNinja")
	public String ninjaAdd(@Valid @ModelAttribute("ninja")Ninja ninja, BindingResult result, Model viewModel) {
		if(result.hasErrors()) {
			List<Dojo> allDojos = this.assignmentService.allDojos();
			viewModel.addAttribute("allDojos", allDojos);
			return "addNinja.jsp";
		}
		this.assignmentService.addNinja(ninja);
		return "redirect:/dojo/" + ninja.getDojo().getId();
	}
}
