package com.laughingenigmas.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.laughingenigmas")
@EntityScan("com.laughingenigmas")  
@EnableJpaRepositories("com.laughingenigmas")
public class Applicaiton {

	public static void main(String[] args) {
		SpringApplication.run(Applicaiton.class, args);
	}

}
