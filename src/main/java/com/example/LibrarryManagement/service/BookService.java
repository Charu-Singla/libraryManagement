package com.example.LibrarryManagement.service;

import com.example.LibrarryManagement.model.Book;

import java.util.List;

public interface BookService {
	void addBook(Book book);
	
	public List<Book> getBooks();
	public List<Book> getBooksByName(String name);
	public List<Book> getBooksByAuthor(String author);
	public List<Book> getBooksByCategory(String category);
	
	public Boolean isBookAvalible(Long id);
	
	public void assignBook(Long id, String userName);
}
