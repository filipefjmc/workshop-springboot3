package com.unbfjmc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unbfjmc.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
