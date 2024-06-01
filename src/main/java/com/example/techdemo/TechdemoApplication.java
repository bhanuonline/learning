package com.example.techdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.techdemo")
@ComponentScan("com.example.techdemo")
@EntityScan("com.example.techdemo")
public class TechdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechdemoApplication.class, args);
	}


}
