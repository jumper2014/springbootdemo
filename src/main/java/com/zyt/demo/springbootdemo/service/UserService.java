package com.zyt.demo.springbootdemo.service;

import com.zyt.demo.springbootdemo.entity.User;
import java.util.List;
public interface UserService {

    List<User> findAll();
}
