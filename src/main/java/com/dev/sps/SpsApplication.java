package com.dev.sps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(info =@Info(title = "University Project Management Swagger APIs"))
@SpringBootApplication
public class SpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpsApplication.class, args);
	}

}
