package com.zyt.demo.springbootdemo.service;

import com.zyt.demo.springbootdemo.entity.User;
import java.util.List;
import com.zyt.demo.springbootdemo.dto.UserResponse;

public interface UserService {

    List<User> findAll();

    UserResponse getUserResponse(String userID);
}
