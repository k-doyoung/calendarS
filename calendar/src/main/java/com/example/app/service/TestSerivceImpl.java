package com.example.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.mapper.TestMapper;

@Service
public class TestSerivceImpl implements TestService {

	@Autowired
	private TestMapper testMapper;
	
	
	@Override
	public int getUsers() throws Exception{
		return testMapper.getUsers();
	}
}
