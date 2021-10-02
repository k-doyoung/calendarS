package com.example.app.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserDto {
	
	private String id;
	private String name;
	private String age;
	
//	public UserDto(String name,int age) {
//		this.setName(name);
//		this.setAge(age);
//	}
//	
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
	
}
