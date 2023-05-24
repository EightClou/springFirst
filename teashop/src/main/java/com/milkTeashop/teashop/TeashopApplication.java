package com.milkTeashop.teashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TeashopApplication {

	public static void main(String[] args) {

		SpringApplication.run(TeashopApplication.class, args);
	}


	@GetMapping("/tea")
	public String tea(@RequestParam(value = "type", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/")
	public String root(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello root %s!", name);
	}

}

