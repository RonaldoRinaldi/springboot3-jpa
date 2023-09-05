package com.ronaldo.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronaldo.estudo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
