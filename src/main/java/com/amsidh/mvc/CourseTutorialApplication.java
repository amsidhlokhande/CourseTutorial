package com.amsidh.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = { "com.amsidh.mvc.repository" })
@SpringBootApplication
public class CourseTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseTutorialApplication.class, args);
	}

}
