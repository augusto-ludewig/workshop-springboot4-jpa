package com.hibernate.study.couse.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.study.couse.hibernate.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
