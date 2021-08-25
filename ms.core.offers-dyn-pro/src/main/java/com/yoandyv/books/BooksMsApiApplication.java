package com.yoandyv.books;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class BooksMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksMsApiApplication.class, args);
	}

}
