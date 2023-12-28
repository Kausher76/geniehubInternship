package com.userCrud.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.userCrud.DTO.UserDTO;  

public interface UserControllerInterface {
	
	public ResponseEntity<UserDTO> addUser(@RequestBody UserDTO userDTO);
	public ResponseEntity<UserDTO> getUserById(@PathVariable("id") int id);
	public ResponseEntity<List<UserDTO>> getAllUsers();
	public ResponseEntity<Void> deleteUserById(@PathVariable("id") int id);
	public ResponseEntity<UserDTO> updateUserById(@PathVariable("id") int id, @RequestBody UserDTO userDTO);
	
}
