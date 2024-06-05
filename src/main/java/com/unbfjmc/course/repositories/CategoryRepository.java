package com.unbfjmc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unbfjmc.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
