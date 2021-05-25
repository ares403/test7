package com.miniswing.prodservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.miniswing")
public class ProdServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdServiceApplication.class, args);
	}

}
