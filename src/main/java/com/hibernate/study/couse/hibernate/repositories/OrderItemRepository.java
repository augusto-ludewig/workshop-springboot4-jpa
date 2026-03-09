package com.hibernate.study.couse.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.study.couse.hibernate.entities.Order;
import com.hibernate.study.couse.hibernate.entities.OrderItem;
import com.hibernate.study.couse.hibernate.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {

}
