package com.dkrysov.remotecoffeemaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class RemoteCoffeemakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RemoteCoffeemakerApplication.class, args);
	}

}
