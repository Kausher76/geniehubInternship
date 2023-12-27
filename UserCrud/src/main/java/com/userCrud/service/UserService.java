package com.userCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userCrud.dao.UserRepo;
import com.userCrud.entities.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public List<User> getAllUsers() {
		List<User> list = (List<User>) this.userRepo.findAll();
		return list;
	}
	
	public User findUserById(int id) {
		User user = null;
		try {
			user = this.userRepo.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public User addUser(User user) {
		User user1 = this.userRepo.save(user);
		return user1;
	}
	
	public void deleteUser(int id) {
		this.userRepo.deleteById(id);
	}
	
	public User updateUserById(int id, User Updateduser) {
		Updateduser.setId(id);
		this.userRepo.save(Updateduser);
		return Updateduser;
	}
}
