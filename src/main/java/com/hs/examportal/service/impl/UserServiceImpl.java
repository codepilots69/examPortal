package com.hs.examportal.service.impl;

import com.hs.examportal.entity.User;
import com.hs.examportal.repository.UserRepository;
import com.hs.examportal.service.IUserService;
import com.hs.examportal.utility.UserUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
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

    @Override
    public List<User> getAllUsers() {
        try {
            List<User> userList = userRepository.findAll();
            return userList;
        }catch (Exception ex){
            throw ex;
        }
    }

    @Override
    public User updateUser(String id, User user) {
        try {
            User existingUser = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User does not exist with id: " + id));
            existingUser.setFullName(user.getFullName());
            existingUser.setUpdatedAt(LocalDateTime.now());
             userRepository.save(existingUser);
             log.info("User updated successfully for id: " +id);
             return existingUser;
        }
        catch (Exception ex){
            log.error("Exception occurred while updating user with id: {} {} ", id, ex.getMessage());
            throw ex;
        }
    }
}
