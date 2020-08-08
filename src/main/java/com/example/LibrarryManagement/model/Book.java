package com.example.LibrarryManagement.model;

import javax.persistence.*;

@Entity
@Table(name="book_info")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="isbn")
	private long id;
	
	@Column(name="book_name")
	private String name;
	
	@Column(name="book_category")
	private String categoryName;
	
	@Column(name="rack_number")
	private int rackNumber;
	
	@Column(name="author")
	private String author;
	
	@Column(name="user_id")
	private long userId;
	
	@Column (name=" is_issued")
	private int isIssued;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getRackNumber() {
		return rackNumber;
	}
	public void setRackNumber(int rackNumber) {
		this.rackNumber = rackNumber;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public int getIsIssued() {
		return isIssued;
	}
	public void setIsIssued(int isIssued) {
		this.isIssued = isIssued;
	}
}
