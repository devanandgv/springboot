package com.dev.topicscovered.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Source {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="topic")
	private String topic;
	
	@Column(name="date")
	private Date date;

	@OneToOne(mappedBy="source")
	private TopicsCovered topicsCovered;
	
	
	public TopicsCovered getTopicsCovered() {
		return topicsCovered;
	}

	public void setTopicsCovered(TopicsCovered topicsCovered) {
		this.topicsCovered = topicsCovered;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Source [id=" + id + ", topic=" + topic + ", date=" + date + "]";
	}
	
	
	
}
