package com.armando.LoginRegister.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.armando.LoginRegister.models.LoginUser;
import com.armando.LoginRegister.models.User;
import com.armando.LoginRegister.services.BookService;
import com.armando.LoginRegister.services.UserService;

//.. don't forget to include all your imports! ..

@Controller
public class HomeController {
 
 // Add once service is implemented:
 @Autowired
 private UserService users;
 @Autowired
 private BookService books;
 
 @GetMapping("/")
 public String index(Model model) {
 
     // Bind empty User and LoginUser objects to the JSP
     // to capture the form input
     model.addAttribute("newUser", new User());
     model.addAttribute("newLogin", new LoginUser());
     return "index.jsp";
 }
 
 @PostMapping("/register")
 public String register(@Valid @ModelAttribute("newUser") User newUser, 
         BindingResult result, Model model, HttpSession session) {
     
     // TO-DO Later -- call a register method in the service 
     // to do some extra validations and create a new user!
	 User user = users.register(newUser, result);
     
     if(result.hasErrors()) {
         // Be sure to send in the empty LoginUser before 
         // re-rendering the page.
         model.addAttribute("newLogin", new LoginUser());
         return "index.jsp";
     }
     
     // No errors! 
     // TO-DO Later: Store their ID from the DB in session, 
     // in other words, log them in.
     session.setAttribute("userId", newUser.getId());
 
     return "redirect:/welcome";
 }
 
 @PostMapping("/login")
 public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
         BindingResult result, Model model, HttpSession session) {
     
     // Add once service is implemented:
     User user = users.login(newLogin, result);
 
     if(result.hasErrors()) {
         model.addAttribute("newUser", new User());
         return "index.jsp";
     }
     session.setAttribute("userId", user.getId());
     return "redirect:/welcome";
 	}
 
 @GetMapping("/logout")
 public String logout(HttpSession session) {
	 session.setAttribute("userId", null);
	 return "redirect:/";
 }
 
 @GetMapping("/welcome")
public String home(Model model, HttpSession session) {
	 if(session.getAttribute("userId") == null) {
		 return "redirect:/";
	 }
	 model.addAttribute("books", books.all());
	 model.addAttribute("user", users.findById((Long)session.getAttribute("userId")));
	 return "Dashboard.jsp";
 }
}

