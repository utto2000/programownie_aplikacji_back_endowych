package com.example.zadanie8;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Zadanie8Application {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(Zadanie8Application.class, args);

		ObjectMapper objectMapper = new ObjectMapper();

		String userJson = "{\"name\":\"John\",\"age\":21}";
		User userObject = objectMapper.readValue(userJson, User.class);

		System.out.println(userObject.getName());
		System.out.println(userObject.getAge());
	}

}
