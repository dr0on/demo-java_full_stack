package com.thoughtscript.javafullstack.dao;

import com.thoughtscript.javafullstack.domain.User;

public class UserDao {
	
	
	
	
	
	
	

	public static User fetchUserByName(String name) {
		
		User user = new User();
		int id = 0;
		user.setId(id);
		user.setName(name);
		return user;
		
	}
}