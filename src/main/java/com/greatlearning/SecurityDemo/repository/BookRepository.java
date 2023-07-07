package com.greatlearning.SecurityDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.SecurityDemo.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	List<Book> findByNameContainsAndAuthorContainsAllIgnoreCase(String name, String author);
}
