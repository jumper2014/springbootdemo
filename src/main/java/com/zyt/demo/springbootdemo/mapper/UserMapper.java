package com.zyt.demo.springbootdemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.zyt.demo.springbootdemo.entity.User;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();
}
