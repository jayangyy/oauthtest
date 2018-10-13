/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kcframework.security.oauthtest1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

/**
 *
 * @author jayan 资源服务器
 */
@Configuration
@EnableResourceServer
public class ResourceConfig extends ResourceServerConfigurerAdapter {

    @Bean
    public TokenStore tokenStore() {
        return new JwtTokenStore(jwtAccessTokenConverter());
    }

    //与授权服务器使用共同的密钥进行解析
    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter() {
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        converter.setSigningKey("123");
        return converter;
    }
//        @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http.
//                csrf().disable()
//                //.exceptionHandling()
////                .authenticationEntryPoint()
//               // .and()
//                .authorizeRequests().antMatchers("/hello").permitAll().antMatchers("/oauth/**").permitAll().anyRequest().authenticated()
//                .and()
//                .httpBasic();
//    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
                .and()
                .requestMatchers().antMatchers("/oauthhello")
                .and()
                .authorizeRequests().antMatchers("/hello").permitAll()
                .antMatchers("/oauthhello").access("#oauth2.hasScope('app')").and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
    }

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) {
        resources.tokenServices(tokenServices()).resourceId("resource1");
    }

    @Bean
    @Primary
    public DefaultTokenServices tokenServices() {
        DefaultTokenServices defaultTokenServices = new DefaultTokenServices();
        defaultTokenServices.setTokenStore(tokenStore());
        return defaultTokenServices;
    }
}
