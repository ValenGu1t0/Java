package com.valentino.tallerIV;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TallerIvApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TallerIvApplication.class, args);
	}
}

// visitar http://localhost:8080/h2-console 