package com.hibernate.study.couse.hibernate.configuration;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.hibernate.study.couse.hibernate.entities.Category;
import com.hibernate.study.couse.hibernate.entities.Order;
import com.hibernate.study.couse.hibernate.entities.User;
import com.hibernate.study.couse.hibernate.entities.enums.OrderStatus;
import com.hibernate.study.couse.hibernate.repositories.CategoryRepository;
import com.hibernate.study.couse.hibernate.repositories.OrderRepository;
import com.hibernate.study.couse.hibernate.repositories.UserRepository;

@Configuration
@Profile("desenvolvimento")
public class DesenvolvimentoConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria", "maria@email.com", "4198989898", "123456");
		User u2 = new User(null, "Alex", "alex@email.com", "45989595495", "123456");
		User u3 = new User(null, "João", "joao@email.com", "4198989898", "123456");
		userRepository.saveAll(Arrays.asList(u1, u2, u3));
		
		Order o1 = new Order(null, Instant.now(), u1, OrderStatus.SHIPPED);
		Order o2 = new Order(null, Instant.parse("2026-01-05T03:42:10Z"), u1, OrderStatus.PAID);
		Order o3 = new Order(null, Instant.parse("2025-12-06T03:42:10Z"), u2, OrderStatus.CANCELED);
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
		Category c1 = new Category(null, "Eletronics");
		Category c2 = new Category(null, "Computers");
		Category c3 = new Category(null, "Books");
		Category c4 = new Category(null, "Tools");
		categoryRepository.saveAll(Arrays.asList(c1, c2, c3, c4));
	}
	

}
