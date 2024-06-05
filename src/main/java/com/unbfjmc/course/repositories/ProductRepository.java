package com.unbfjmc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unbfjmc.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
