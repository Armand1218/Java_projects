package com.armando.OmikujiAssignment.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	
	@GetMapping("/")
	public String index1() {
		return "redirect:/omikuji";
	}
	
	@GetMapping("/omikuji")
	public String index2() {
		return "index.jsp";
	}
	
	@GetMapping("/omikuji/show")
	public String index3(HttpSession session, Model model) {
		String result = (String)session.getAttribute("showOmikuji");
		model.addAttribute("result", result);
		return "Show.jsp";
		}
	
	@PostMapping("/addData")
	public String add(
		@RequestParam("number") int number,
		@RequestParam("city") String city,
		@RequestParam("person") String person,
		@RequestParam("hobby") String hobby,
		@RequestParam("thing") String thing,
		@RequestParam("message") String message,
		HttpSession session
		) {
		String showOmikuji = String.format("In %s years, you will live in %s with %s as your roommate, \n"
				+ "%s for a living. The next time you see a %s \n"
				+ ", you will have a goodluck. Also, %s!", number, city, person,hobby, thing, message);
		session.setAttribute("showOmikuji", showOmikuji);
		
		return "redirect:/omikuji/show";
	}
	
}