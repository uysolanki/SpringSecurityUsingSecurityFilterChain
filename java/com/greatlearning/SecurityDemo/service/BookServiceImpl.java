package com.greatlearning.SecurityDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.SecurityDemo.model.Book;
import com.greatlearning.SecurityDemo.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookRepository bookrepository;
	@Override
	public List<Book> findAll() {
		List<Book> books= bookrepository.findAll();
		return books;
	}

	@Override
	public Book findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Book theBook) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteById(int theId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Book> searchBy(String name, String author) {
		// TODO Auto-generated method stub
		return null;
	}

}
