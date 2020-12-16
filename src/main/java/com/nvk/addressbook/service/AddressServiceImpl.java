package com.nvk.addressbook.service;

import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService{



	@Override
	public String getFriendsList() {
		// TODO Implementation to get list of friends and contact numbers
		return new String();
	}

	@Override
	public boolean addFriends() {
		// TODO Implementation to add friends and contact numbers
		return true;
	}

	@Override
	public String[] checkFriends() {
		
		String[] checkedFriendsList = {"one","two", "three", "four", "five"};
		return checkedFriendsList;
	}

}