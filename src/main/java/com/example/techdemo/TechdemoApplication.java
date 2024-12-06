package com.example.techdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
//@EnableJpaRepositories("com.example.techdemo")
@ComponentScan("com.example.techdemo.mvc")
//@EntityScan("com.example.techdemo")
@EnableWebMvc
public class TechdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechdemoApplication.class, args);
	}


}


