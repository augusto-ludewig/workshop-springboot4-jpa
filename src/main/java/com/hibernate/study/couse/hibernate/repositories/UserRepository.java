package com.hibernate.study.couse.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.study.couse.hibernate.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
