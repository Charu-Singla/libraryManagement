package com.example.LibrarryManagement.repository;

import com.example.LibrarryManagement.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long>{

	List<Book> findByName(String name);
	
	List<Book> findByAuthor(String author);
	List<Book> findByCategoryName(String category);
	
	List<Book> findByIdAndIsIssued(Long id, int isIssued);
}
