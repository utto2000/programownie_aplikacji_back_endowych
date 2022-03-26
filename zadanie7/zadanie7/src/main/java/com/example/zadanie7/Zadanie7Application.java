package com.example.zadanie7;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Zadanie7Application {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(Zadanie7Application.class, args);

		ObjectMapper objectMapper = new ObjectMapper();

		User userObject = new User("John", 21);
		String userJson = objectMapper.writeValueAsString(userObject);

		System.out.println(userJson);

	}


}
