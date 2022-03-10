package com.learing.jpa.concepts.javalearningjpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learing.jpa.concepts.javalearningjpa.entity.User;
import com.learing.jpa.concepts.javalearningjpa.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {
	
	private static final Logger log =
			LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// save user
		User user = new User("zenj", "Admin");
		userRepository.save(user);
		log.info("New User is created :" + user);	
	}
}
