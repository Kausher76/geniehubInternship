package com.userCrud.DTO;

import org.springframework.stereotype.Component;

@Component
public class UserDTO {
	private int id;
	private String name;
	private String skills;
	private int age;
	private String location;
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDTO(int id, String name, String skills, int age, String location) {
		super();
		this.id = id;
		this.name = name;
		this.skills = skills;
		this.age = age;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + ", skills=" + skills + ", age=" + age + ", location=" + location
				+ "]";
	}
	
	
	
	
	
	
}
