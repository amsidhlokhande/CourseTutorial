package com.amsidh.mvc.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amsidh.mvc.domain.UserInfo;
import com.amsidh.mvc.repository.UserRepository;
import com.amsidh.mvc.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

	// private final static List<UserInfo> users = new ArrayList<UserInfo>();
	@Autowired(required = true)
	private UserRepository userRepository;

	public UserServiceImpl() {
		log.info("Loading UserServiceImpl!!!");
	}

	@Override
	public UserInfo createUser(UserInfo userInfo) {
		// users.add(userInfo);
		UserInfo savedUser = userRepository.save(userInfo);
		return savedUser;
	}

	@Override
	public List<UserInfo> getAllUsers() {
		return StreamSupport.stream(userRepository.findAll().spliterator(), false).collect(Collectors.toList());
		// return users;
	}

	@Override
	public UserInfo getUserByUserId(Integer userId) {
		return userRepository.findById(userId).orElse(null);
		// return users.stream().filter((UserInfo userInfo) -> userInfo.getId() ==
		// userId).findFirst().get();

	}

	@Override
	public UserInfo getUserByUserNameAndPassword(UserInfo userInfo) {
		UserInfo user = userRepository.findUserInfoByEmailIdAndPassword(userInfo.getEmailId(), userInfo.getPassword());
		return user;
		/*
		 * return users.stream().filter((UserInfo user) ->
		 * user.getEmailId().equalsIgnoreCase(userInfo.getEmailId()) &&
		 * user.getPassword().equalsIgnoreCase(userInfo.getPassword())).findFirst().
		 * orElse(null);
		 */
	}

}
