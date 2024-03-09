package com.app.crud.service;

import java.util.List;

import com.app.crud.dto.User;

public interface UserService {

	void insertUser(User user);

	List<User> getAllList();

	void updateUser(User user);

	void deleteUser(Integer uId);

	List<User> findByuNameOrId(String uName, int uId);

	
}
