package com.hibernate.study.couse.hibernate.configuration;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.hibernate.study.couse.hibernate.entities.User;
import com.hibernate.study.couse.hibernate.repositories.UserRepository;

@Configuration
@Profile("desenvolvimento")
public class DesenvolvimentoConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria", "maria@email.com", "4198989898", "123456");
		User u2 = new User(null, "Alex", "alex@email.com", "45989595495", "123456");
		User u3 = new User(null, "João", "joao@email.com", "4198989898", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3));
		
	}
	

}
