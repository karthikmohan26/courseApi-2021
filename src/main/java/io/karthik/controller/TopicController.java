package io.karthik.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.karthik.model.Topic;
import io.karthik.service.TopicService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

//Step 5
@RestController
public class TopicController {

	@Autowired
	private TopicService topicService ;
	
	@RequestMapping(method = RequestMethod.GET,value="/api/topics")
	@ApiOperation(value="All Topics", notes="Get All Topics for a Course",response=Topic.class)
	public List<Topic> getAllTopics() {

		return topicService.getAllTopics();
	}
	
	@RequestMapping(method = RequestMethod.GET,value="/api/topics/{id}")
	@ApiOperation(value="Topic by Id", notes="Topics for a Paticular Id",response=Topic.class)
	public Topic getTopicbyId( @ApiParam(value="Topic Id",required = true)@PathVariable String id) {

		return topicService.getTopicId(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/api/topics")
	public void AddTopic(@RequestBody Topic topic) {

		topicService.addTopic(topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/api/topics/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id) {

		topicService.updateTopic(topic, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value="/api/topics/{id}")
	public void deleteTopic(@PathVariable String id) {

		topicService.deleteTopic(id);
	}
}
