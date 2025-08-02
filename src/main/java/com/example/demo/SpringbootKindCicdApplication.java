package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootKindCicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootKindCicdApplication.class, args);
	}

	@GetMapping("/")
	public String home() {
		return "Spring Boot App running on Kubernetes via Jenkins CI/CD!!!!!!";
	}

	@GetMapping("/hello")
	public String sayHi() {
		return "sayHi";
	}
}
