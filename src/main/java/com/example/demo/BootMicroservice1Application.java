package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootMicroservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(BootMicroservice1Application.class, args);
	}
	
	@GetMapping
	public String getHello() {
		return "from Microservive 1";
	}

}
