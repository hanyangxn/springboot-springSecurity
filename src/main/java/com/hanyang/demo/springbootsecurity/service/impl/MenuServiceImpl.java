package com.hanyang.demo.springbootsecurity.service.impl;

import com.hanyang.demo.springbootsecurity.bean.Menu;
import com.hanyang.demo.springbootsecurity.mapper.MenuMapper;
import com.hanyang.demo.springbootsecurity.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;


    @Override
    public List<Menu> getMenusByUserId(Integer userId) {
        return menuMapper.getMenusByUserId(userId);
    }
}
