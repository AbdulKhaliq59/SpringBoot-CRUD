package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public interface UserService {
    User signUp(User user);

    void sendRegistrationEmail(User user);
}
