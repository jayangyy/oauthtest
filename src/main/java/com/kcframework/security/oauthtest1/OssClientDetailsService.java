///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.kcframework.security.oauthtest1;
//
//import java.util.Arrays.ArrayList;
//import java.util.List;
//import java.util.Set;
//import java.util.TreeSet;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.oauth2.provider.ClientDetails;
//import org.springframework.security.oauth2.provider.ClientRegistrationException;
//
///**
// *
// * @author Jayang
// */
//public class OssClientDetailsService  implements ClientDetailsService{ 
//    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
////        //log.warn("loadClientByClientId");
////        OssApp app = new OssApp();
////        app.setAppId("123456");
////        app.setSecret("654321");
//        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//        authorities.add(new SimpleGrantedAuthority("READ"));
//        authorities.add(new SimpleGrantedAuthority("WRITE"));
//        app.setAuthorities(authorities);
//        // 授权类型
//        Set<String> authorizedGrantTypes = new TreeSet<String>();
//        authorizedGrantTypes.add("password");
//        authorizedGrantTypes.add("refresh_token");
//        authorizedGrantTypes.add("authorization_code");
//        app.setAuthorizedGrantTypes(authorizedGrantTypes);
//        Set<String> scope = new TreeSet<String>();
//        scope.add("openid");
//        app.setScope(scope);
//        return app;
//    }
//}