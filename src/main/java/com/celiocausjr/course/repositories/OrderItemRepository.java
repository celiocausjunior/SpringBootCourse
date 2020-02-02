package com.celiocausjr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.celiocausjr.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
