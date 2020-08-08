package com.example.LibrarryManagement.model;

import java.util.List;

public class BookResponse {

	
	private String bookName;
	private int copiesLeft;
	private int copiesIssued;
	
	private List<Book> issuedBooks;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getCopiesLeft() {
		return copiesLeft;
	}

	public void setCopiesLeft(int copiesLeft) {
		this.copiesLeft = copiesLeft;
	}

	public int getCopiesIssued() {
		return copiesIssued;
	}

	public void setCopiesIssued(int copiesIssued) {
		this.copiesIssued = copiesIssued;
	}

	public List<Book> getIssuedBooks() {
		return issuedBooks;
	}

	public void setIssuedBooks(List<Book> issuedBooks) {
		this.issuedBooks = issuedBooks;
	}
	
	
}
