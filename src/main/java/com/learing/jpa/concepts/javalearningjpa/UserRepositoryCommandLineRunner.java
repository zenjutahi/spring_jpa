package com.learing.jpa.concepts.javalearningjpa;

import java.util.List;
import java.util.Optional;

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
		
		Optional<User> userWithIdOne = userRepository.findById(1L);
		log.info("New User is retrieved :" + userWithIdOne );
		
		List<User> users = userRepository.findAll();
		log.info("All users :" + users);
	}
}
