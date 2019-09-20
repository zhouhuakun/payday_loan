package com.example.usermanagement.service;

import com.example.usermanagement.entity.User;

import java.util.List;

public interface UserService {
    List<User> seleceAll();
    
    User selectByone(int id);
}
