package com.dev.topicscovered.service;

import java.util.List;

import com.dev.topicscovered.model.TopicsCovered;

public interface TopicsCoveredService {

	public List<TopicsCovered> getDetailsByDate(String date);

	public List<TopicsCovered> getDetailsByTopic(String topic);

	public List<TopicsCovered> getDetailsByKeywords(String keywords);

	public String addTopicsCovered(TopicsCovered topicsCovered);

}
