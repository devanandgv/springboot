package com.dev.topicscovered.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.dev.topicscovered.controller", "com.dev.topicscovered.service" })
@Configuration
@EnableJpaRepositories(basePackages = "com.dev.topicscovered")
@EntityScan(basePackages = "com.dev.topicscovered.model")
public class TopicsCoveredApplication {

	public static void main(String[] args) {
		SpringApplication.run(TopicsCoveredApplication.class, args);

	}
}
