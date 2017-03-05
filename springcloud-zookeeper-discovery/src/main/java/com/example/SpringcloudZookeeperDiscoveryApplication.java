package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudZookeeperDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudZookeeperDiscoveryApplication.class, args);
	}
}
