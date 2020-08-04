package com.zyt.demo.springbootdemo.controller;

import com.zyt.demo.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import com.zyt.demo.springbootdemo.entity.User;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();

    }
}
