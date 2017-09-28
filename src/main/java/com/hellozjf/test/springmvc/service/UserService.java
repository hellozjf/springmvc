package com.hellozjf.test.springmvc.service;

import org.springframework.stereotype.Service;

import com.hellozjf.test.springmvc.domain.User;

@Service
public class UserService {
    
    private User user;

    public void createUser(User user) {
        this.user = user;
    }
}
