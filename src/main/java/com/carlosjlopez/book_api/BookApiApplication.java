package com.carlosjlopez.book_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entry point for the Spring Boot application.
 * <p>
 * This class bootstraps the application by launching the embedded web server
 * (Tomcat by default) and initializing the Spring context.
 * </p>
 */
@SpringBootApplication
public class BookApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookApiApplication.class, args);
	}

}
