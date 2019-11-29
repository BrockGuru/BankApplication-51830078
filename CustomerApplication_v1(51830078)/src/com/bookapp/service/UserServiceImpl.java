package com.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookapp.persistence.User;
import com.bookapp.persistence.UserDao;
@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
private UserDao userdao;
	@Override
	public User getUserByEmail(String email, String password) {
		// TODO Auto-generated method stub
		return userdao.getUserByEmail(email, password);
	}

	@Override
	public void addUser(User user) {
	userdao.addUser(user);
		
	}

	@Override
	public List<User> getAllUser() {
		
		return userdao.getAllUser();
	}

}
