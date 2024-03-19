package com.jah.springtest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSpringWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringWebApplication.class, args);
		System.out.println("Test Spring web");
	}

}
