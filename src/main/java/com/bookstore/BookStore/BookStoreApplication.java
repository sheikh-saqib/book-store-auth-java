package com.bookstore.BookStore;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class BookStoreApplication {

	@Autowired
	private Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@PostConstruct
	public void init() {
		String[] activeProfiles = environment.getActiveProfiles();
		System.out.println("Active Profiles: " + Arrays.toString(activeProfiles));
	}

}
