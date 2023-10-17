package com.armando.DisplayAssignment;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayControllers {
	// class definition and imports here...
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Armando Robles";
        String itemName = "Bandai Kaido";
        double price = 10.25;
        String description = "A big statue model of 10 beasts captain, Kaido!";
        String vendor = "Bandai";
    
    	// Your code here! Add values to the view model to be rendered
    model.addAttribute("name", name);
    model.addAttribute("price", price);
    model.addAttribute("itemName", itemName);
    model.addAttribute("description", description);
    model.addAttribute("vendor", vendor);
        return "index.jsp";
    }
    //...
}
