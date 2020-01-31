package com.celiocausjr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.celiocausjr.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
