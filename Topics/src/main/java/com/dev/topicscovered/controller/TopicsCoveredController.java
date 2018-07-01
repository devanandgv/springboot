package com.dev.topicscovered.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class TopicsCoveredController {

	
	@GetMapping("/topic/{date}")
	public String getTopic(@PathVariable("date")String date) {
		
		return "";
		
	}
}
