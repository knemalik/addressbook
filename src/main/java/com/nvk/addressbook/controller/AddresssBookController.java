package com.nvk.addressbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nvk.addressbook.dto.UserRequestDto;
import com.nvk.addressbook.exception.CustomException;
import com.nvk.addressbook.service.AddressServiceImpl;
import com.nvk.addressbook.service.UserService;
import com.nvk.addressbook.service.UserServiceImpl;

@RestController
@RequestMapping(value = "/api")
@EnableAutoConfiguration
public class AddresssBookController {

	@Autowired(required = true)
	UserServiceImpl userServiceImpl;
	
	@Autowired(required = true)
	AddressServiceImpl addressSerivceImpl;

	@PostMapping("/user")
	public String createUser(@RequestBody UserRequestDto userRequestDto ) throws Exception {

		String user = null;
		try {
		 user = userServiceImpl.createUser(userRequestDto);
		}
		catch(Exception e)
		{
			throw new CustomException();
		}
		return user;

	}

	@PostMapping("/addressbook/unique/")
	public ResponseEntity<String>[] checkFriends() throws Exception {
		
		ResponseEntity<String> friends[] = null;
		try {
			addressSerivceImpl.checkFriends();
			}
		catch(Exception e)
		{
			throw new CustomException();
		}
		return friends;
		 
	}

	@RequestMapping("/addressbook")
	@ResponseBody
	public String getAddressBook() {
		return addressSerivceImpl.getFriendsList();
	}

	@PostMapping("/address")
	public String postAdrress() {
		String response = "failure";
		Boolean result = addressSerivceImpl.addFriends();
		if(result == true) {
			response = "success";
		}
		return response;

	}

	@RequestMapping("manage/user")
	@ResponseBody
	public String manageUser() {

		return userServiceImpl.manageUser();
	}

}