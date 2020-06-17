package com.hanyang.demo.springbootsecurity.service;

import com.hanyang.demo.springbootsecurity.bean.User;

import java.util.List;

public interface UserService  {
     User getUserInfo(User user);

     User loadUserByUsername(String s);

     List<User> getAllUsers();
}
