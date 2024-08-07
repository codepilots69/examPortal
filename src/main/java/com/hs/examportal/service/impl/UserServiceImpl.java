package com.hs.examportal.service.impl;

import com.hs.examportal.entity.User;
import com.hs.examportal.repository.UserRepository;
import com.hs.examportal.service.IUserService;
import com.hs.examportal.utility.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserUtils userUtils;
    @Override
    public User createUser(User user) {
        try {
            user.setId(userUtils.createRandomId(9));
            return userRepository.save(user);
        }catch(Exception ex) {
            throw ex;
        }
    }

    @Override
    public User getUserById(String id) {
        try{
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found with id: " + id));
        return user;
        }catch(Exception ex) {
            throw ex;
        }
    }
}
