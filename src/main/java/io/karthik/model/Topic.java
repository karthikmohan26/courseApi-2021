package io.karthik.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "VO for Topic")
public class Topic {

	
	@ApiModelProperty(notes = "Primary ",allowableValues = "String")
	private String topicId;
	private String topicName;
	private String topicDescription;
	
	public Topic(String topicId, String topicName, String topicDescription) {
		super();
		this.topicId = topicId;
		this.topicName = topicName;
		this.topicDescription = topicDescription;
	}
	
	public Topic() {
	}	
	
	public String getTopicId() {
		return topicId;
	}
	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getTopicDescription() {
		return topicDescription;
	}
	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}
	
}
