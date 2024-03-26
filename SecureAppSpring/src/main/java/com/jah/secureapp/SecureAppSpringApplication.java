package com.jah.secureapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecureAppSpringApplication {

	public static void main(String[] args) {
		System.out.println("Hello Spring");
		SpringApplication.run(SecureAppSpringApplication.class, args);
	}

}
