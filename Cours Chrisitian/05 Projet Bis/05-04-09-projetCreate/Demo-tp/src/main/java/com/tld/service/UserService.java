package com.tld.service;

import java.util.List;

import com.tld.entities.User;

public interface UserService {

	public List<User> getUsers();

	public void saveUser(User user);
}
