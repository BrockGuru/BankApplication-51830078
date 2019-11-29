package com.bookapp.service;

import java.util.List;

import com.bookapp.persistence.User;

public interface UserService {
	public User getUserByEmail(String email,String password);
	public void addUser(User user);
	public List<User>getAllUser();
}
