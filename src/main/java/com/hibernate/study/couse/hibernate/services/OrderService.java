package com.hibernate.study.couse.hibernate.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.study.couse.hibernate.entities.Order;
import com.hibernate.study.couse.hibernate.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll() {
		return orderRepository.findAll();
	}
	
	public Order findById(Long id) {
		return orderRepository.findById(id).get();
	}
}
