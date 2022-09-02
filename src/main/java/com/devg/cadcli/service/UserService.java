package com.devg.cadcli.service;


import com.devg.cadcli.model.User;
import com.devg.cadcli.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder encoder;

    public User createUser(User user){
        encodePassword(user);
        User savedUser = repository.save(user);
        return savedUser;
    }
    public void encodePassword(User user){
        String pass = user.getPassword();
        user.setPassword(encoder.encode(pass));
    }
}