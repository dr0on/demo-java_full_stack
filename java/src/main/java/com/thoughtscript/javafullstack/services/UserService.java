package com.thoughtscript.javafullstack.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thoughtscript.javafullstack.dao.UserDao;
import com.thoughtscript.javafullstack.domain.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public boolean authenticate(String email, String password) {
		return userDao.authenticate(email, password);
	}
	
	public User fetchUserByEmail(String email) {
		User user = userDao.fetchUserByEmail(email);
		return user;
	}
	
	
}