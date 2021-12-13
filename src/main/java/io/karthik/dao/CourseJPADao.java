package io.karthik.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.karthik.model.Course;

@Repository
public interface CourseJPADao extends CrudRepository<Course, String> {

}
