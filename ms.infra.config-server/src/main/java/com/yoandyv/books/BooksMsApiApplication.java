package com.yoandyv.books;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class BooksMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksMsApiApplication.class, args);
	}

}
