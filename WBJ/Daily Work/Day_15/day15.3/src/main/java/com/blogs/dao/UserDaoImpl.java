package com.blogs.dao;


import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blogs.pojos.User;


@Repository //dao layer spring bean
public class UserDaoImpl implements UserDao {
	//dependency - javax.persistence.EntityManager(super i/f of Hibernate Session)
	@Autowired //byType OR JPA annotation : @PersistenceContext
	private EntityManager entityManager;

	@Override
	public User userSignIn(String email, String password) {
		String jpql="select u from User u where u.email=:em and u.password=:pwd";
		return entityManager
				.createQuery(jpql, User.class)
				.setParameter("em", email)
				.setParameter("pwd", password)
				.getSingleResult();
				
	}

}
