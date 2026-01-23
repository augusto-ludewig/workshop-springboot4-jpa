package com.hibernate.study.couse.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.study.couse.hibernate.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
