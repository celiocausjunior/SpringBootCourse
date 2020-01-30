package com.celiocausjr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.celiocausjr.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
