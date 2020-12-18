package com.amsidh.mvc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amsidh.mvc.domain.UserInfo;

@Repository
public interface UserRepository extends CrudRepository<UserInfo, Integer> {
	
	UserInfo findUserInfoByEmailIdAndPassword(String emailId, String password);

}
