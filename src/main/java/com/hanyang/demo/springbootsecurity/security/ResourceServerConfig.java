//package com.hanyang.demo.springbootsecurity.security;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
//
///**
// * @Author 江南一点雨
// * @Site www.javaboy.org 2019-08-12 23:15
// */
//@Configuration
//@EnableResourceServer
//public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
//    @Override
//    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
//        resources.resourceId("rid").stateless(true);
//    }
//
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().antMatchers("/list").hasRole("admin")
//                .antMatchers("/add").hasRole("user")
//                .anyRequest().authenticated();
//    }
//}