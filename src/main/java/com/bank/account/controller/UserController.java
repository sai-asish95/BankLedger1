package com.bank.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bank.account.entity.UserRegistration;
import com.bank.account.model.UserModel;
import com.bank.account.service.UserRegistrationService;



@RestController
@RequestMapping(value="user")
public class UserController {
	
	@Autowired
	UserRegistrationService userRegistrationService;
	

	@RequestMapping(value="/detail1/{userId}", method=RequestMethod.GET)
	public ResponseEntity<UserRegistration> getuserdetail(@PathVariable String userId){
		
		UserRegistration userRegistration = userRegistrationService.getUserDetail(userId);
		
		return new ResponseEntity<UserRegistration>(userRegistration,HttpStatus.OK );
	}
}
	

