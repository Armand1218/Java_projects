package com.armando.LoginRegister.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.armando.LoginRegister.models.Book;

public interface BookRepo extends CrudRepository<Book, Long>{
	List<Book> findAll();
}
