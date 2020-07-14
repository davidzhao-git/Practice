package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseAppDemoApplication {

	public static void main(String[] args) {
		
    	System.setProperty("spring.devtools.restart.enabled", "true");  

		SpringApplication.run(CourseAppDemoApplication.class, args);
	
	}

}
