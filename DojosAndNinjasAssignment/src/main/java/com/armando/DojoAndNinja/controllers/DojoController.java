package com.armando.DojoAndNinja.controllers;

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

import com.armando.DojoAndNinja.model.Dojo;
import com.armando.DojoAndNinja.service.AssignmentService;

@Controller
@RequestMapping("/dojo")
public class DojoController {
	@Autowired
	private AssignmentService assignmentService;
	
	@GetMapping("/add")
	public String addDojo(@ModelAttribute("dojo")Dojo dojo) {
		return "addDojo.jsp";
	}
	
	@PostMapping("/createDojo")
	public String dojoAdd(@Valid @ModelAttribute("dojo")Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "addDojo.jsp";
		}
		this.assignmentService.addDojo(dojo);
		return "redirect:/ninja/add";
	}
	@GetMapping("/{id}")
	public String showDojo(Model viewModel, @PathVariable("id")Long id) {
		viewModel.addAttribute("dojo", this.assignmentService.getADojo(id));
		return "showDojo.jsp";
	}
	
}
