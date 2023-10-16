package com.hello.human;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false) String name) {
		if(name == null) {
			return "Hello Human";
		}else {
			return "Hello " + name;
		}
		
	}
	// need help on multiple parameter
	//@RequestMapping("/wln") 
	//public String index2(@RequestParam("name") String name, @RequestParam("last_name") String last_name) {  
	//	return "Hello " + name + last_name;
	//}
}