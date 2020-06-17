package com.hanyang.demo.springbootsecurity.mapper;

import com.hanyang.demo.springbootsecurity.bean.Menu;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MenuMapper {
    List<Menu> getMenusByUserId(Integer userId);
}
