package com.dev.topicscovered.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class TopicsCovered {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="topic")
	private String topic;
	
	@Column(name="sub_topic")
	private String subTopic;
	
	@Column(name="keywords")
	private String keywords;
	
	@JoinColumn(name="source_id")
	@OneToOne
	private Source source;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getSubTopic() {
		return subTopic;
	}

	public void setSubTopic(String subTopic) {
		this.subTopic = subTopic;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "TopicsCovered [id=" + id + ", date=" + date + ", topic=" + topic + ", subTopic=" + subTopic
				+ ", keywords=" + keywords + ", source=" + source.toString() + "]";
	}
	
	
}
