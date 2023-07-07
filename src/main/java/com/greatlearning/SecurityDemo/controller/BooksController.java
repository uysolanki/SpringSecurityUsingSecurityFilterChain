package com.greatlearning.SecurityDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.SecurityDemo.model.Book;
import com.greatlearning.SecurityDemo.service.BookService;



@Controller
public class BooksController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/list")
	public String listBooks(Model model)
	{
	List<Book> manybooks=bookService.findAll();
	model.addAttribute("Books",manybooks);	
		return "list-Books.jsp";
	}
}
