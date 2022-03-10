package com.learing.jpa.concepts.javalearningjpa.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.learing.jpa.concepts.javalearningjpa.entity.User;

// repository refers to something that interacts with database
// declarative transaction.
@Repository
@Transactional
public class UserDAOService {
	//to ensure changes in the entity are tracked i.e managed
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(User user){
		entityManager.persist(user);
		return user.getId();
	}
}
