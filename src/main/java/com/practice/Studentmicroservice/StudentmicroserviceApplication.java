package com.practice.Studentmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class StudentmicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentmicroserviceApplication.class, args);
	}

}
