package com.jah.springtest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringTest1Application.class, args);
		System.out.println("hello Spring");
	}

}
