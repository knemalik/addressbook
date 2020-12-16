package com.nvk.addressbook.persistence;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.nvk.addressbook.dto.UserRequestDto;


public class CreateUserService {
	static Map<String,UserRequestDto> userDetailsMap = new HashMap<>();


	
	public String createUser(UserRequestDto userRequestDto) {

		String user = userRequestDto.getName();
		userDetailsMap.put(user, userRequestDto);
		return user;

	}

	public ArrayList<UserRequestDto> getAllUsers() {
        Set<String> keySet = userDetailsMap.keySet(); 
        Collection<UserRequestDto> values = userDetailsMap.values(); 
  
        ArrayList<UserRequestDto> allUserDetails = new ArrayList<>(values); 
		return allUserDetails;

	}

}
