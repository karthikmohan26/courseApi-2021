package io.karthik.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.karthik.model.Course;
import io.karthik.service.CourseServiceJPA;

@RestController
public class CourseControllerJPA {

	@Autowired
	private CourseServiceJPA courseService;

	@RequestMapping(method = RequestMethod.GET, value = "api/courses")
	public List<Course> getAllCourses() {

		return courseService.getAllCourses();

	}

	@RequestMapping(method = RequestMethod.POST, value = "api/courses")
	public void AddCourse(@RequestBody Course course) {
		courseService.AddCourses(course);

	}

	@RequestMapping(method = RequestMethod.GET, value = "api/courses/{id}")
	public Course getCourse(@PathVariable String id) {

		return courseService.GetCourse(id);

	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "api/courses/{id}")
	public void UpdateCourse(@RequestBody Course course ,@PathVariable String id) {

		 courseService.UpdateCourse(course,id);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "api/courses/{id}")
	private void DeleteCourse(@RequestBody Course course, @PathVariable String id) {

		 courseService.DeletCourse(course,id);

	}
	
	

}
