package com.zyt.demo.springbootdemo.service.impl;

import com.zyt.demo.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.zyt.demo.springbootdemo.entity.User;
import com.zyt.demo.springbootdemo.mapper.UserMapper;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();

    }
}
