package com.blogs.service;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blogs.dao.UserDao;
import com.blogs.pojos.User;

@Service //B.L holder spring bean
@Transactional //for auto tx management
public class UserServiceImpl implements UserService {
	//depcy - dao layer
	@Autowired
	private UserDao userDao;

	@Override
	public User signIn(String email, String pass) {
		// TODO Auto-generated method stub
		return userDao.userSignIn(email, pass);
	}

}
