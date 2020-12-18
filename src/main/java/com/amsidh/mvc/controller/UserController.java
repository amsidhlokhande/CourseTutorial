package com.amsidh.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amsidh.mvc.domain.UserInfo;
import com.amsidh.mvc.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user")
@Slf4j
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = { "*" })
public class UserController {

	@Autowired(required = true)
	private UserService userService;

	public UserController(UserService userService) {
		log.info("Loading UserController!!!");
		this.userService = userService;
	}

	@PostMapping()
	public UserInfo saveUser(@RequestBody UserInfo userInfo) {
		return this.userService.createUser(userInfo);
	}

	@GetMapping
	public List<UserInfo> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/{userId}")
	public UserInfo getUserByUserId(@PathVariable("userId") Integer userId) {
		return userService.getUserByUserId(userId);
	}

	@PostMapping("/login")
	public UserInfo login(@RequestBody UserInfo userInfo) {
		return userService.getUserByUserNameAndPassword(userInfo);
	}

}
