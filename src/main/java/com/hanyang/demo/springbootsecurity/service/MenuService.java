package com.hanyang.demo.springbootsecurity.service;

import com.hanyang.demo.springbootsecurity.bean.Menu;

import java.util.List;


public interface MenuService {

    List<Menu> getMenusByUserId(Integer userId);
}
