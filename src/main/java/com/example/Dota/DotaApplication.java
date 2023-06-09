package com.example.Dota;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DotaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DotaApplication.class, args);
	}
	
	@GetMapping("/ola")
	public String ola() {
		return "Caio zika";
	}
}
