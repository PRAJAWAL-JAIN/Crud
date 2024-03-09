package com.app.crud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.crud.dto.User;
import com.app.crud.repo.UserRepository;
import com.app.crud.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository ur;

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		ur.save(user);
	}

	@Override
	public List<User> getAllList() {
		// TODO Auto-generated method stub
		return (List<User>) ur.findAll();
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		ur.save(user);
	}

	@Override
	public void deleteUser(Integer uId) {
		// TODO Auto-generated method stub
		ur.deleteById(uId);

	}

	@Override
	public List<User> findByuNameOrId(String uName, int uId) {
		// TODO Auto-generated method stub
		return ur.findByUnameOrUid(uName, uId);
		// return null;
	}

}
