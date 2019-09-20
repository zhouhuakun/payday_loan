package com.example.usermanagement.service.impl;

import com.example.usermanagement.entity.User;
import com.example.usermanagement.mapper.UserMapper;
import com.example.usermanagement.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserSeviceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public List<User> seleceAll() {
        return userMapper.selectAll();
    }

    @Override
    public User selectByone(int id) {
        return userMapper.selectByone(id);
    }
}
