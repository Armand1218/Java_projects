package com.armando.LoginRegister.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.armando.LoginRegister.models.Book;
import com.armando.LoginRegister.repositories.BookRepo;

@Service
public class BookService {
	
	@Autowired
	private BookRepo bookRepo;
	
	public Book findById(Long id) {
		Optional<Book> result = bookRepo.findById(id);
		if(result.isPresent()) {
			return result.get();
		}
		return null;
	}
	
	public List<Book> all() {
		return bookRepo.findAll();
	}
	
	public Book create(Book book) {
		return bookRepo.save(book);
	}
	
	public Book updateBook(Book book) {
		return bookRepo.save(book);
	}
	
	public void deleteBook(Book book) {
		bookRepo.delete(book);
	}
}
