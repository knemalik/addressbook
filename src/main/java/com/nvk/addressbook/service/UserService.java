package com.nvk.addressbook.service;

import com.nvk.addressbook.dto.UserRequestDto;

public interface UserService {
	String createUser(UserRequestDto userRequestDto);

	String manageUser();
}
