package com.hibernate.study.couse.hibernate.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.study.couse.hibernate.entities.User;
import com.hibernate.study.couse.hibernate.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		return userRepository.findById(id).get();
	}
}
