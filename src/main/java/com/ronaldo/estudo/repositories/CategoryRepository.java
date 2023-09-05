package com.ronaldo.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronaldo.estudo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
