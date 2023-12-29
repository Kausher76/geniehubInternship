package com.userCrud.controller.impl;



import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

import com.userCrud.DTO.Convertor;
import com.userCrud.DTO.UserDTO;
import com.userCrud.controller.UserControllerInterface;
import com.userCrud.entities.User;
import com.userCrud.service.impl.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;



@RestController
@Tag(name = "UserController", description = "To perform Crud operations on USERS")
public class UserController implements UserControllerInterface {

    @Autowired
    private UserService userService;

    @Autowired
    private Convertor convertor;

    @Operation(summary = "POST Operations on Users", description = "It is used to add Users to Database")
    @PostMapping("/user")
    public ResponseEntity<UserDTO> addUser(@RequestBody UserDTO userDTO) {
        User userEntity = convertor.convertToEntity(userDTO);
        User createdUser = this.userService.addUser(userEntity);
        UserDTO createdUserDTO = convertor.convertToDto(createdUser);
        return new ResponseEntity<>(createdUserDTO, HttpStatus.CREATED);
    }

    @Operation(summary = "GET Operations on User", description = "It is used to Fetch Particular user From Database using id")
    @GetMapping("/user/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable("id") int id) {
        User user = this.userService.findUserById(id);
        if (user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        UserDTO userDTO = convertor.convertToDto(user);
        return ResponseEntity.of(Optional.of(userDTO));
    }

    @Operation(summary = "GET Operations on Users", description = "It is used to fetch all Users from Database")
    @GetMapping("/users")
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        List<User> userList = this.userService.getAllUsers();
        if (userList.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        List<UserDTO> userDTOList = userList.stream()
                .map(convertor::convertToDto)
                .collect(Collectors.toList());
        return ResponseEntity.of(Optional.of(userDTOList));
    }

    @Operation(summary = "DELETE Operations on User", description = "It is used to Delete Users from Database using ID")
    @DeleteMapping("/user/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable("id") int id) {
        try {
            this.userService.deleteUser(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @Operation(summary = "PUT Operations on User", description = "It is used to Update User from Database using ID")
    @PutMapping("/user/{id}")
    public ResponseEntity<UserDTO> updateUserById(@PathVariable("id") int id, @RequestBody UserDTO userDTO) {
        User existingUser = this.userService.findUserById(id);
        if (existingUser == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        User userEntity = convertor.convertToEntity(userDTO);
        User updatedUser = this.userService.updateUserById(id, userEntity);
        UserDTO updatedUserDTO = convertor.convertToDto(updatedUser);
        return new ResponseEntity<>(updatedUserDTO, HttpStatus.OK);
    }
}

