package com.dev.topicscovered.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.topicscovered.model.TopicsCovered;
import com.dev.topicscovered.service.TopicsCoveredService;

@RestController
@RequestMapping("/v1")
public class TopicsCoveredController {

	@Autowired
	private TopicsCoveredService service;
	
	@GetMapping("/date/{date}")
	public List<TopicsCovered> getDetailsByDate(@PathVariable("date") String date) {

		return null;

	}

	@GetMapping("/topic/{topic}")
	public @ResponseBody List<TopicsCovered> getDetailsByTopic(@PathVariable("topic") String topic) {

		System.out.println(topic);
		return this.getService().getDetailsByTopic(topic);

	}

	@GetMapping("/keyword/{keyword}")
	public List<TopicsCovered> getDetailsByKeyword(@PathVariable("keyword") String keyword) {

		System.out.println("contrller : "+keyword);
		return this.getService().getDetailsByKeywords(keyword);

	}

	@PostMapping
	public String addTopicsCovered(@RequestBody TopicsCovered topicsCovered) {

		return null;
	}

	public TopicsCoveredService getService() {
		return service;
	}

	public void setService(TopicsCoveredService service) {
		this.service = service;
	}

}
