package com.example.Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/api/v1")
public class TestApplication {

	@GetMapping("/message")
	public String message() {
		return "Deployed successfully";
	}

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
