package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@SpringBootApplication
@RestController
public class HellowolddemoApplication {

	@RequestMapping("/")
	String hello() {
		return "Hello Mohammed";
	}
	@RequestMapping("/bay")
	String bay() {
		return "bay Mohammed";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HellowolddemoApplication.class, args);
	}

}
