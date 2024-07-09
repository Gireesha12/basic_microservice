package com.practice.erekamicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ErekamicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErekamicroserviceApplication.class, args);
	}

}
