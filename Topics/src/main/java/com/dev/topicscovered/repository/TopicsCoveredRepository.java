package com.dev.topicscovered.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dev.topicscovered.model.TopicsCovered;

public interface TopicsCoveredRepository extends CrudRepository<TopicsCovered, Long> {

	List<TopicsCovered> findByDate(Date date);

	List<TopicsCovered> findByTopic(String topic);
	@Query("Select t from TopicsCovered t where t.keywords LIKE %?1%")
	List<TopicsCovered> findByKeywords(String keywords);
}
