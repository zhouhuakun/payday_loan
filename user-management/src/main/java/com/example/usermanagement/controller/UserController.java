package com.example.usermanagement.controller;

import com.example.usermanagement.entity.User;
import com.example.usermanagement.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/user")
    public List<User> selectAll(){
        return userService.seleceAll();
    }
    @RequestMapping(value = "/one",params = "id")
    public User selectByOne(int id){
        return userService.selectByone(id);
    }
}
