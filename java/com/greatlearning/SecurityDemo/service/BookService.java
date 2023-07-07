package com.greatlearning.SecurityDemo.service;

import java.util.List;

import com.greatlearning.SecurityDemo.model.Book;


public interface BookService {
	
	List<Book >findAll();
	
	Book findById(int theId);
	
	void save(Book theBook);
	
	void DeleteById(int theId);
	
	List<Book>searchBy(String name,String author);
	
}