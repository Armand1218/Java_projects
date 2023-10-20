package com.armando.LoginRegister.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.armando.LoginRegister.models.Book;
import com.armando.LoginRegister.models.User;
import com.armando.LoginRegister.services.BookService;
import com.armando.LoginRegister.services.UserService;


@Controller
public class BookController {
	// Add once service is implemented:
	@Autowired
	private UserService users;
	@Autowired
	private BookService books;

	
	@GetMapping("/addBook")
    public String addPage(@ModelAttribute("book") Book book, Model model, HttpSession session) {
    	
    	User user = users.findById((Long)session.getAttribute("userId"));
    	model.addAttribute("user", user);
    	
    	return "addBook.jsp";
    }
	
	@PostMapping("/books")
	public String makeBook(@Valid @ModelAttribute("book") Book book, BindingResult result) {
    	if (result.hasErrors()) {
    		return "addBook.jsp";
    	}
    	books.create(book);
    	return "redirect:/welcome";
	}
	
    @GetMapping("/books/{id}")
    public String showPage(Model model, @PathVariable("id") Long id, HttpSession session) {
    	if(session.getAttribute("userId") == null) {
    		return "redirect:/";
    	}
    	Book book = books.findById(id);
    	model.addAttribute("book", book);
    	model.addAttribute("user", users.findById((Long)session.getAttribute("userId")));
    	
    	return "showBook.jsp";
    }
    
    @GetMapping("/books/{id}/edit")
    public String edit(Model model, @PathVariable("id") Long id, HttpSession session) {
    	if(session.getAttribute("userId") == null) {
    		return "redirect:/";
    	}
    	Book book = books.findById(id);
    	model.addAttribute("book", book);
    	model.addAttribute("user", users.findById((Long)session.getAttribute("userId")));
    	return "edit.jsp";
    }

    
    @PutMapping("/books/{id}/edit")
    public String editBook(Model model, @Valid @ModelAttribute("book")Book book, BindingResult result, HttpSession session) {
    	if(session.getAttribute("userId") == null) {
    		return "redirect:/";
    	}
    	if(result.hasErrors()) {
    		return "edit.jsp";
    	}
    	books.updateBook(book);
    	return "redirect:/welcome";
    }
    
    @GetMapping("/books/{id}/delete")
    public String delete(@PathVariable("id") Long id, HttpSession session) {
    	Book book = books.findById(id);
    	books.deleteBook(book);
    	return "redirect:/welcome";
    }
    
    @GetMapping("/books/{id}/borrow")
    public String borrow(@PathVariable("id") Long id, HttpSession session) {
    	if(session.getAttribute("userId") == null) {
    		return "redirect:/welcome";
    	}
    	Book book = books.findById(id);
    	book.setBorrower(users.findById((Long)session.getAttribute("userId")));
    	books.updateBook(book);
    	return "redirect:/welcome";
    }

    
    @GetMapping("/books/{id}/return")
    public String returnBook(@PathVariable("id") Long id, HttpSession session) {
    	if(session.getAttribute("userId") == null) {
    		return "redirect:/";
    	}
    	Book book = books.findById(id);
    	book.setBorrower(null);
    	books.updateBook(book);
    	return "redirect:/welcome";
    }
}
