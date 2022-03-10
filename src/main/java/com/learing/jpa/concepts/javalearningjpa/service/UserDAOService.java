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


/*
 * Spring Data JPA
 * -Avails an interface repositories to manage entities
 */

/*
 * in case another entity is created and a DAO service is required, the same process
 * is followed to create the services i.e if 15 entities are created the 15 DAO services
 * need to be constructed thus the need for Spring Data JPA
public class SomeEntityDAOService {
	//to ensure changes in the entity are tracked i.e managed
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(SomeEntity entity){
		entityManager.persist(entity);
		return entity.getId();
	}
}
*/

