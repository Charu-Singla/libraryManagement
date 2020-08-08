package com.example.LibrarryManagement.service;

import com.example.LibrarryManagement.model.Category;

import java.util.List;

public interface CategoryService {

	Category addCategory(Category category);

	List<Category> categoryExists();
}
