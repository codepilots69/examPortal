package com.hs.examportal.controller;

import com.hs.examportal.entity.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IUserController {

    /**
     * Controller method to create user
     * @author shubham.katre
     * @since 07.08.24
     * @param user
     */
    public ResponseEntity<User> createUser(User user);

    public ResponseEntity<User> getUserById(String id);

    public ResponseEntity<List<User>> getAllUsers();

    public ResponseEntity<User> updateUser(String id, User user);
}
