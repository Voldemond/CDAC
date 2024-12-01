package com.blogs.service;

import com.blogs.pojos.User;

public interface UserService {
//add a method for user login
	User signIn(String email,String pass);
}
