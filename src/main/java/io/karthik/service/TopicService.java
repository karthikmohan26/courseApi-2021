package io.karthik.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import io.karthik.model.Topic;

@Service
public class TopicService {

	private List<Topic> topics=new ArrayList<>(Arrays.asList(
			new Topic("1","Spring","Spring Description"),
			new Topic("2","Spring Boot","Spring Boot Description"),
			new Topic("3","Angular","Angular Description")
			));

	public List<Topic>getAllTopics() {

		return topics;
	}
	
	public Topic getTopicId(String id) {
		
		
		Topic topic= new Topic();	
		for(int i=0;i<topics.size();i++) {
		
			if(topics.get(i).getTopicId().equalsIgnoreCase(id)) {
				
			topic.setTopicId(id);
			topic.setTopicName(topics.get(i).getTopicName());
			topic.setTopicDescription(topics.get(i).getTopicDescription());
			}
	}

		return topic;
	}

	public void addTopic(Topic topic) {

		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {

		for(int i=0;i<topics.size();i++) {
		if(id.equalsIgnoreCase(topics.get(i).getTopicId())) {
		topic.setTopicId(id);
		topic.setTopicName(topic.getTopicDescription());
		topic.setTopicDescription(topic.getTopicDescription());
		}
	}
		topics.add(topic);

	}

	public void deleteTopic(String id) {
		
		for(int i=0;i<topics.size();i++) {
			if(id.equalsIgnoreCase(topics.get(i).getTopicId())) {
				topics.remove(i);

					}
		}
		
	
	}
}

