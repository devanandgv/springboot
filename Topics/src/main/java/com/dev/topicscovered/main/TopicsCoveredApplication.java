package com.dev.topicscovered.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.dev.topicscovered")
public class TopicsCoveredApplication {

	public static void main(String[] args) {
        SpringApplication.run(TopicsCoveredApplication.class, args);
}
}
