package com.sathish.springboot.dockerdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
/* @RestController */
public class SpringBootDockerApplication {
	
	/*
	 * @GetMapping("/message") public String getMessage() { return
	 * "Welcome to Docker..!!!"; }
	 */
	
	public static Logger logger = LoggerFactory.getLogger(SpringBootDockerApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application Started..!");
	}

	public static void main(String[] args) {
		logger.info("Application Executed..!");
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

}
