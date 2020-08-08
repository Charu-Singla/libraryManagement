package com.example.LibrarryManagement.repository;

import com.example.LibrarryManagement.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
