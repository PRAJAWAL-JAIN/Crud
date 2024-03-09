package com.app.crud.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.crud.dto.User;
import com.app.crud.service.UserService;

@RestController
@RequestMapping("/user")
public class UserCtrl {

	@Autowired
	UserService userSer;

	@PostMapping("/saveUser")
	public String save(@RequestBody User user) {
		userSer.insertUser(user);
		return "data is saved";
	}

	@GetMapping("/getList")
	public List<User> getList() {
		return userSer.getAllList();
	}

	@PostMapping("/update")
	public String update(@RequestBody User user) {
		userSer.insertUser(user);
		return "data is update";
	}

	@GetMapping("/delete/{uId}")
	public void delete(@PathVariable("uId") int uId) {
		userSer.deleteUser(uId);
	}

	@PostMapping("/getById")
	public List<User> findByuNameOrId(@RequestParam String uName, @RequestParam int uId) {
		return userSer.findByuNameOrId(uName, uId);

	}

}
