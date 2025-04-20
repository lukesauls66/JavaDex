package com.example.pokedex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.pokedex.repository.UserRepository;
import com.example.pokedex.model.User;
import java.util.List;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public void addUser(User user) {
        userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
