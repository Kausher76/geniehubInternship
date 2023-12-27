package com.userCrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.userCrud.entities.User;
import com.userCrud.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;



@RestController
@Tag(name = "UserController", description = "To perform Crud operations on USERS")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Operation(summary = "POST Opeartions on Users", description = "It is used to add Users to Database")
	@PostMapping("/user")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User createdUser = this.userService.addUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }
	
	@Operation(summary = "GET Opeartions on User", description = "It is used to Fetch Prticular user From Database using id")
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") int id) {
		User user =  this.userService.findUserById(id);
		if (user == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(user));
	}
	
	@Operation(summary = "GET Opeartions on Users", description = "It is used to featch all Users from Database")
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> list = this.userService.getAllUsers();
		if(list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}
	
	@Operation(summary = "DELETE Opeartions on User", description = "It is used to Delete Users from Database using ID")
	@DeleteMapping("/user/{id}")
	public ResponseEntity<Void> deleteBookById(@PathVariable("id") int id) {
		try {
			this.userService.deleteUser(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	@Operation(summary = "PUT Opeartions on User", description = "It is used to Update User from Database using ID")
	@PutMapping("/user/{id}")
    public ResponseEntity<User> updateUserById(@PathVariable("id") int id, @RequestBody User user2) {
		User existingUser = this.userService.findUserById(id);
		if (existingUser == null) {
			return new ResponseEntity<>(existingUser, HttpStatus.NO_CONTENT);
		}
        User updatedUser = this.userService.updateUserById(id, user2);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }
}
