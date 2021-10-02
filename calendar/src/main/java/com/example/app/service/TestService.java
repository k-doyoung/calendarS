package com.example.app.service;

import java.util.List;

import com.example.app.dto.UserDto;


public interface TestService {

	int getUsers() throws Exception;
	
	List<UserDto> getUserList();

}
