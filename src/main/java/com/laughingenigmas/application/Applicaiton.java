package com.laughingenigmas.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.laughingenigmas")
@SpringBootApplication
public class Applicaiton {

	public static void main(String[] args) {
		SpringApplication.run(Applicaiton.class, args);
	}

}
