package com.example.LibrarryManagement.service;

import com.example.LibrarryManagement.model.Category;
import com.example.LibrarryManagement.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryRepository catRepo;
	
	@Override
	public List<Category>categoryExists() {
		// TODO Auto-generated method stub
		
		return catRepo.findAll();
		
	}

	@Override
	public Category addCategory(Category category) {
		category=catRepo.save(category);
		return category;
	}

}
