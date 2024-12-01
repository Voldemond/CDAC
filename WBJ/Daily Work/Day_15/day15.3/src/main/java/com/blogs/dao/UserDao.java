package com.blogs.dao;

import com.blogs.pojos.User;

public interface UserDao {
//add a method for sigin in
	User userSignIn(String email, String password);
}
