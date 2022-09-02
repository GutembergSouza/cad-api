package com.devg.cadcli.controller;

import com.devg.cadcli.model.User;
import com.devg.cadcli.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping
    public void createUser(@RequestBody User user){
        service.createUser(user);
    }


}