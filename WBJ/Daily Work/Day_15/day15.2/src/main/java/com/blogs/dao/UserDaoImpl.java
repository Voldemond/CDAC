package com.blogs.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blogs.pojos.User;


@Repository //dao layer spring bean
public class UserDaoImpl implements UserDao {
	//dependency - SF
	@Autowired //byType
	private SessionFactory factory; 

	@Override
	public User userSignIn(String email, String password) {
		String jpql="select u from User u where u.email=:em and u.password=:pwd";
		return factory.getCurrentSession()
				.createQuery(jpql, User.class)
				.setParameter("em", email)
				.setParameter("pwd", password)
				.getSingleResult();
				
	}

}
