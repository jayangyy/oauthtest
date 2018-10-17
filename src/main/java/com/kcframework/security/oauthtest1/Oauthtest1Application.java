package com.kcframework.security.oauthtest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class Oauthtest1Application {

	public static void main(String[] args) {
		SpringApplication.run(Oauthtest1Application.class, args);
	}
}
