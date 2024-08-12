package com.hs.examportal.service;

import com.hs.examportal.entity.User;

import java.util.List;

public interface IUserService {
    /**
     * Service method to create user
     * @author shubham.katre
     * @since 07.08.24
     * @param user
     */
    public User createUser(User user);

    public User getUserById(String id);

    public List<User> getAllUsers();

    User updateUser(String id, User user);
}
