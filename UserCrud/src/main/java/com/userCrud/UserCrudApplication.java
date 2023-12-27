package com.userCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info (
				title = "User OPEN API",
				version = "1.0",
				description = "User API DOCUMENTATION"
			),
		servers = @Server(
				url = "http://localhost:8080",
				description = "User OPEN API URL"
			)
		
)
public class UserCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserCrudApplication.class, args);
	}

}
