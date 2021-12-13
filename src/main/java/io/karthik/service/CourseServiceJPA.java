package io.karthik.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.karthik.dao.CourseJPADao;
import io.karthik.model.Course;

@Service
public class CourseServiceJPA {
	
	@Autowired
	private CourseJPADao courseDao;
	

	public List<Course> getAllCourses() {
		List <Course> courses= new ArrayList<Course>();
	    courseDao.findAll().forEach(courses::add);
	    return courses;
	}

	public void AddCourses(Course course) {
		courseDao.save(course);
		
		
	}

	public Course GetCourse(String id) {

		Course course= new Course();
	    course=courseDao.findOne(id);
		return course;
	}

	public void UpdateCourse(Course course, String id) {
		courseDao.save(course);		
	}

	public void DeletCourse(Course course, String id) {
		courseDao.delete(course);	
	}

}
