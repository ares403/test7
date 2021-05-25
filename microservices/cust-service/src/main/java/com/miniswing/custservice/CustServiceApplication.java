package com.miniswing.custservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.miniswing")
public class CustServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustServiceApplication.class, args);
	}

}
