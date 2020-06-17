package com.hanyang.demo.springbootsecurity.service.impl;

import com.hanyang.demo.springbootsecurity.bean.User;
import com.hanyang.demo.springbootsecurity.mapper.UserMapper;
import com.hanyang.demo.springbootsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserInfo(User user) {
        User userInfo = userMapper.getUserInfo(user);
        return userInfo;
    }

    @Override
    public User loadUserByUsername(String s) {
        return userMapper.loadUserByUsername(s);
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }
}
