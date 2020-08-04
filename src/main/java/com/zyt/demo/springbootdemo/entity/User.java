package com.zyt.demo.springbootdemo.entity;

import java.io.Serializable;

public class User implements Serializable {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Long id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String username;
    private String password;
}
