package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.dto.UserDto;
import com.example.app.service.TestService;


@RestController
public class TestController {

	@Autowired
	private TestService testService;
	
	
	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	public @ResponseBody UserDto getUser() {
		//UserDto userInfo = new UserDto("도영", 29);
		UserDto userInfo = new UserDto();
		userInfo.setAge(30);
		userInfo.setName("ssㄴ");
		
		return userInfo;
	}
	
	@GetMapping("/getTest")
	public int getUsers() throws Exception {
		return testService.getUsers();
	}
}