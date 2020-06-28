package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static final String REST-URL = "https://www.firstcry.com/getshirt";
	
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		int x =10;
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);

		ctxt.close();
	}

}
