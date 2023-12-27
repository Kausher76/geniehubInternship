package com.userCrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userCrud.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	public User findById(int id);
}
