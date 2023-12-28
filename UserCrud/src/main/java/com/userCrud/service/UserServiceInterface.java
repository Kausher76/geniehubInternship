package com.userCrud.service;

import java.util.List;

import com.userCrud.entities.User;

public interface UserServiceInterface {
	User addUser(User user);
    User findUserById(int id);
    List<User> getAllUsers();
    void deleteUser(int id);
    User updateUserById(int id, User user);
}
