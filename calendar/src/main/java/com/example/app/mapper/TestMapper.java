package com.example.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.app.dto.UserDto;

@Mapper
@Repository
public interface TestMapper {

	int getUsers() throws Exception;
	
	List<UserDto> getUserList();
}
