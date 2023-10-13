package com.armando.daikichi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")

public class DaikichiController {
	@RequestMapping("")
	public String daikichi1() {
		return "Welcome!";
	}
	
	@RequestMapping("/today")
	public String daikichi2() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/tommorow")
	public String daikichi3() {
		return "Tommorow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/travel/{city}")
	public String travel(@PathVariable String city) {
		return "Congratulations you will soon travel to " + city;
	}
	
	@RequestMapping("/lotto/{num}")
	public String daikichi5(@PathVariable int num) {
		if (num % 2 ==0) {
		return "You will take a grand journey in the near future, but be weary of tempting offers.";
	} else {
		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends!";
		}
	}
}