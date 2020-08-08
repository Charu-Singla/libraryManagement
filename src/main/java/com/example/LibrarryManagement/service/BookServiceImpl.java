package com.example.LibrarryManagement.service;

import com.example.LibrarryManagement.model.Book;
import com.example.LibrarryManagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepo;

	@Override
	public void addBook(Book book) {

	}
	
	public List<Book> getBooks(){
		return bookRepo.findAll();
	}
	
	@Override
	public List<Book> getBooksByName(String name) {
		// TODO Auto-generated method stub
		return bookRepo.findByName(name);
	}

	@Override
	public List<Book> getBooksByAuthor(String author) {
		// TODO Auto-generated method stub
		return bookRepo.findByAuthor(author);
	}

	@Override
	public List<Book> getBooksByCategory(String category) {
		// TODO Auto-generated method stub
		return bookRepo.findByCategoryName(category);
	
	}

	@Override
	public Boolean isBookAvalible(Long id) {
		// TODO Auto-generated method stub
		if(bookRepo.findByIdAndIsIssued(id,0).size() > 0) {
			
			return true;
		}
		return false;
	}

	@Override
	public void assignBook(Long id, String userName) {
		// TODO Auto-generated method stub
		
		Optional<Book> book = bookRepo.findById(id);
		book.get().setIsIssued(1);
		//sbook.get().set
		
		bookRepo.save(book.get());
		
		
	}

}
