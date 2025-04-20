package com.example.pokedex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.pokedex.service.UserService;
import com.example.pokedex.model.User;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    } 

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
