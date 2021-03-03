package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	int x = 20;
        int y = 30;
	public static void m1() {
		System.out.println("write is coloun");
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		m1();
	}

}
