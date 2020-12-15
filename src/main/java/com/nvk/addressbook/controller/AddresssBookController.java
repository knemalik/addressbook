package com.nvk.addressbook.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class AddresssBookController {
	
	 @PostMapping("/user")
	 public String createUser () {
	 
	         return "<h1>This is the Home page</h1>";
	 
	     }
	 
	 @PostMapping(" /addressbook/unique/")
	 public String checkFriends() {
		 return null;
	 }
	 
	 
	 @RequestMapping("/addressbook")
	 @ResponseBody
	 public String getAddressBook()
	 {
		 return null;
	 }
	 
	 
	 @PostMapping("/address")
	 public String postAdrress() {
		return null;
		 
	 }
	 
	 @RequestMapping("manage/user")
	 @ResponseBody
	 public String manageUser() {

		 return null;
	 }

}
