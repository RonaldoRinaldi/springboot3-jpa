package com.ronaldo.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronaldo.estudo.entities.OrderItem;
import com.ronaldo.estudo.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
