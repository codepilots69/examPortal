package com.hs.examportal.controller.impl;

import com.hs.examportal.controller.IUserController;
import com.hs.examportal.entity.User;
import com.hs.examportal.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
public class UserControllerImpl implements IUserController {

    @Autowired
    IUserService userService;

    @Override
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = userService.createUser(user);
//        return ResponseEntity.ok(savedUser);
        return new ResponseEntity(user, HttpStatus.OK);
    }

    @Override
    @GetMapping
    public ResponseEntity<User> getUserById(@RequestParam String id) {
        User fetchedUser = userService.getUserById(id);
        return new ResponseEntity(fetchedUser, HttpStatus.OK);
    }

    @Override
    @GetMapping(value = "/all")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> fetchedUsersList = userService.getAllUsers();
        return new ResponseEntity(fetchedUsersList, HttpStatus.OK);
    }

    @Override
    @PutMapping
    public ResponseEntity<User> updateUser(@RequestParam String id, @RequestBody User user) {
        User updatedUser = userService.updateUser(id, user);
        return new ResponseEntity(updatedUser, HttpStatus.OK);
    }
}
