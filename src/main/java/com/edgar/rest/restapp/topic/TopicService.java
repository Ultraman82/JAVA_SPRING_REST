package com.edgar.rest.restapp.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/* import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; */

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(
			Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework Description"),
					new Topic("java", "JAva Framework", "JAva Framework Description"),
					new Topic("javascript", "Boot Framework", "Boot Framework Description")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	/*
	 * private String id; private String name; private String description;
	 * 
	 * public TopicService() { }
	 * 
	 * public TopicService(String id, String name, String description) { super();
	 * this.id = id; this.name = name; this.description = description; }
	 * 
	 * public String getId() { return id; }
	 * 
	 * public void setId(String id) { this.id = id; }
	 * 
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public String getDescription() { return description; }
	 * 
	 * public void setDescription(String description) { this.description =
	 * description; }
	 */

}