package com.hanyang.demo.springbootsecurity.security;

import com.hanyang.demo.springbootsecurity.bean.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class SecuritySessionUtil {
    public static User getSessionData() {
        //获取session中用户的数据
        User user = null;
        try {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            if (null == authentication)
                return null;
            UserDetails userDetails = (UserDetails) authentication
                    .getPrincipal();
            user = (User) userDetails;
        } catch (Exception e) {
        }
        return user;
    }

}
