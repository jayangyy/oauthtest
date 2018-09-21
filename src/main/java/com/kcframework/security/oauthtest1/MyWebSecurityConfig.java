///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.kcframework.security.oauthtest1;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.PropertySource;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
///**
// *
// * @author Jayang
// */
//@Configuration
//public class MyWebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    String[] paths = null;
//    @Autowired
//    private PropertySource propertySourceBean;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        if (propertySourceBean.getProperty("security.ignoring") != null) {
//            paths = propertySourceBean.getProperty("security.ignoring").toString().split(",");
//            paths = StringUtil.clearSpace(paths);
//        }
//        super.configure(http);
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        //inMemoryAuthentication 从内存中获取  
//        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("user1").password(new BCryptPasswordEncoder().encode("123456")).roles("USER");
//    }
//
//    @Bean
//    public static PasswordEncoder passwordEncoder() {
//        return NoOpPasswordEncoder.getInstance();
//    }
//
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring()
//                .antMatchers("/favor.ico");
//    }
//}