package com.hs.examportal.service.impl;

import com.hs.examportal.entity.User;
import com.hs.examportal.repository.UserRepository;
import com.hs.examportal.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        User savedUser = userRepository.save(user);
        return savedUser;
    }
}
