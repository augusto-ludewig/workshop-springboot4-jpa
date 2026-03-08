package com.hibernate.study.couse.hibernate.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.study.couse.hibernate.entities.Product;
import com.hibernate.study.couse.hibernate.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository ProductRepository;
	
	public List<Product> findAll() {
		return ProductRepository.findAll();
	}
	
	public Product findById(Long id) {
		return ProductRepository.findById(id).get();
	}
}
