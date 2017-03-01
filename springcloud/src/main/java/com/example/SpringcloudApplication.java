package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudApplication {
	Logger logger = LoggerFactory.getLogger(SpringcloudApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringcloudApplication.class, args);
	}
}
