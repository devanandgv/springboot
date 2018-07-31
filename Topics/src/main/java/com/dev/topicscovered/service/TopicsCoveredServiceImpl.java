package com.dev.topicscovered.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.topicscovered.model.TopicsCovered;
import com.dev.topicscovered.repository.TopicsCoveredRepository;

@Service
public class TopicsCoveredServiceImpl implements TopicsCoveredService {

	@Autowired
	private TopicsCoveredRepository topicsCoveredRepository;


	@Override
	public List<TopicsCovered> getDetailsByDate(String date) {

		return null;
	}

	@Override
	public List<TopicsCovered> getDetailsByTopic(String topic) {

		return topicsCoveredRepository.findByTopic(topic);
	}

	@Override
	public List<TopicsCovered> getDetailsByKeywords(String keywords) {
		
		System.out.println(keywords);
		return topicsCoveredRepository.findByKeywords(keywords);
	}

	@Override
	public String addTopicsCovered(TopicsCovered topicsCovered) {
		// TODO Auto-generated method stub
		return null;
	}

	public TopicsCoveredRepository getTopicsCoveredRepository() {
		return topicsCoveredRepository;
	}

	public void setTopicsCoveredRepository(TopicsCoveredRepository topicsCoveredRepository) {
		this.topicsCoveredRepository = topicsCoveredRepository;
	}

}
