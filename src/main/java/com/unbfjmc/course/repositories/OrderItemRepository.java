package com.unbfjmc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unbfjmc.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
