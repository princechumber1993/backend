package com.niit.jacobwatchco.dao;

import java.util.List;

import com.niit.jacobwatchco.model.Product;
import com.niit.jacobwatchco.model.User;

public interface UserDao {

		
		public boolean addUser(User user);
		public boolean updateUser(User user);
		public boolean deleteUser(int userId);
		public List<User> getUserById();
		public User getUserById(int userId);
		

	}