package com.amsidh.mvc.service;

import java.util.List;

import com.amsidh.mvc.domain.UserInfo;

public interface UserService {

	UserInfo createUser(UserInfo userInfo);
	List<UserInfo> getAllUsers();
	UserInfo getUserByUserId(Integer userId);
	UserInfo getUserByUserNameAndPassword(UserInfo userInfo);
}
