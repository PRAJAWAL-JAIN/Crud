package com.app.crud.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.crud.dto.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findByUnameOrUid(String uName, int uId);

}
