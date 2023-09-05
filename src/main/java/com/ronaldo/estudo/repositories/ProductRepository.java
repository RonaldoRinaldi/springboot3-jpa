package com.ronaldo.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronaldo.estudo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
