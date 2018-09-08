package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//public class DevelopmentApplication extends SpringBootServletInitializer {
public class DevelopmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevelopmentApplication.class, args);
	}
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(Application.class);
//	}

}
