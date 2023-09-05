package com.ronaldo.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronaldo.estudo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
