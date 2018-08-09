package com.dev.springboot.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.dev.springboot.profiles.config")
public class ProfilesTestMain {


	public static void main(String[] args) {

		SpringApplication.run(ProfilesTestMain.class, args);

	}

}
