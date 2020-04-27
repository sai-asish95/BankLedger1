package com.bank.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.account.entity.UserRegistration;
import com.bank.account.model.UserModel;
import com.bank.account.repository.UserRegistrationRepo;
@Service
public class UserRegistrationService {
	
	@Autowired
	UserRegistrationRepo userRegistrationRepo;
	
public UserRegistration getUserDetail(String userId) {
		
		return userRegistrationRepo.findByLoginName(userId);
		
	}

}
