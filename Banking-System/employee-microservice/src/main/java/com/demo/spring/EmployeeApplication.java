package com.demo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args)  {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	@Bean
    public RestTemplate restTemplate() {
        return new RestTemplateBuilder().build();
    }
	@Bean
	public OpenAPI openApiDoc() {
		return new OpenAPI().info(new Info().description("Mock projrct").license(new License().name("Free for All"))
				.title("Mock Project document").version("1.0.1"));
	}
}
