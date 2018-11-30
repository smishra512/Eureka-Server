package com.adidas.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AdidasDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdidasDemoApplication.class, args);
	}
}
