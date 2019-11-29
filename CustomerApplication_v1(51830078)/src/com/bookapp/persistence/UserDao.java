package com.bookapp.persistence;

import java.util.List;

public interface UserDao {
public User getUserByEmail(String email,String password);
public void addUser(User user);
public List<User>getAllUser();

}
