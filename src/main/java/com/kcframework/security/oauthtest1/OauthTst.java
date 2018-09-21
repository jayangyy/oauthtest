///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.kcframework.security.oauthtest1;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
//import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
//import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
//
///**
// *
// * @author Jayang
// */
//@Configuration
//@EnableAuthorizationServer
//public class OauthTst extends AuthorizationServerConfigurerAdapter {
//
//    //获取TOken http://localhost:8083/oauth/token?response_type=code&client_id=client&grant_type=authorization_code&code=ItJ04k&redirect_uri=http://www.baidu.com&client_secret=secret
//    @Override
//    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//        //添加客户端信息
//        clients.inMemory() // 使用in-memory存储客户端信息
//                .withClient("client") // client_id
//                .secret("secret") // client_secret
//                .authorizedGrantTypes("client_credentials","refresh_token","authorization_code") // 该client允许的授权类型
//                //                 .authorizedGrantTypes("authorization_code") // 该client允许的授权类型
//                .scopes("app");                     // 允许的授权范围
//    }
//
//    @Override
//    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
//        endpoints.allowedTokenEndpointRequestMethods(HttpMethod.GET, HttpMethod.POST);// add get method
//        // endpoints.tokenServices(tokenServices);
//    }
//
//    @Override
//    public void configure(AuthorizationServerSecurityConfigurer oauthServer) throws Exception {
//        //enable client to get the authenticated when using the /oauth/token to get a access token
//        //there is a 401 authentication is required if it doesn't allow form authentication for clients when access /oauth/token
//        oauthServer.allowFormAuthenticationForClients();
//    }
//}
