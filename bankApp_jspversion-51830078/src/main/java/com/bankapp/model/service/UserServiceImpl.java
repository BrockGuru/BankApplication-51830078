package com.bankapp.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankapp.model.entities.User;
import com.bankapp.model.exceptions.AccountNotfoundEx;
import com.bankapp.model.exceptions.UserNotFoundException;
import com.bankapp.model.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	private UserRepository userrepository;

	@Autowired
	public UserServiceImpl(UserRepository userrepository) {

		this.userrepository = userrepository;
	}

	@Override
	public User findByEmail(String email) {
		return userrepository.findByEmail(email);

	}

	@Override
	public void addUser(User user) {
		userrepository.save(user);

	}

	@Override
	public List<User> findAll() {
		List<User> user = userrepository.findAll();

		return user;
	}

	@Override
	public void blockUser(Long userId) {

	}

	@Override
	public void deleteUser(Long userId) {
		userrepository.deleteById(userId);

	}

	@Override
	public void updateUser(User user) {
	userrepository.save(user);
	}

	

}
