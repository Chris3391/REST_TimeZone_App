package com.SamTaskApp.SamTaskApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.SamTaskApp.SamTaskApp")
public class SamTaskAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamTaskAppApplication.class, args);
	}

}
