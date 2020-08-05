package com.zyt.demo.springbootdemo.controller;

import com.zyt.demo.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import com.zyt.demo.springbootdemo.entity.User;
import org.springframework.web.bind.annotation.RestController;
import com.zyt.demo.springbootdemo.util.Log4j2Util;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll() {
        Log4j2Util.logger.info("查询用户信息\n");
        return userService.findAll();

    }

    private List<User> getUserList(){
        List<User> lists = userService.findAll();
        return lists;
    }

    @GetMapping
    public ModelAndView userList(Model model) {
        model.addAttribute("userList",getUserList());
        model.addAttribute("title", "用户管理");
        return new ModelAndView("user", "userModel", model);
    }



}
