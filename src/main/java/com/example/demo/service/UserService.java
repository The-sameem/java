package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
@Autowired
 private UserRepository userRepository;

@Autowired
private PasswordEncoder passwordEncoder;

public User saveUser(User user) {
    user.setPassword(passwordEncoder.encode(user.getPassword()));
    return userRepository.save(user);
}

public User findByUsername(String username) {
    return userRepository.findByUsername(username).orElse(null);
}

public boolean existsByUsername(String username) {
    return userRepository.existsByUsername(username);
}
}