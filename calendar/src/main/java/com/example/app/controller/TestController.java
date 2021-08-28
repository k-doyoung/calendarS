package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.app.dto.UserDto;

@Controller
public class TestController {

	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	public @ResponseBody UserDto getUser() {
		UserDto userInfo = new UserDto("도영", 29);

		return userInfo;
	}
}