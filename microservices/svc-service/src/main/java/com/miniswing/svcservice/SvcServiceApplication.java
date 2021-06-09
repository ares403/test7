package com.miniswing.svcservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.miniswing")
public class SvcServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SvcServiceApplication.class, args);
	}

}