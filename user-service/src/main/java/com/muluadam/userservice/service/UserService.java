package com.muluadam.userservice.service;

import com.muluadam.userservice.entity.User;
import com.muluadam.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User saveUser(User user) {

        return  userRepository.save(user);
    }

    public User getUserByUserId(Long userId) {
        return  userRepository.getUserByUserId(userId);
    }
}
