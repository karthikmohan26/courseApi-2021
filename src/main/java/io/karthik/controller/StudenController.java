package io.karthik.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.karthik.dao.StudentDao;
import io.karthik.model.Student;

@RestController
public class StudenController {
	
	@Autowired
	private StudentDao StudentDao ;
	
	@RequestMapping(method = RequestMethod.GET,value="/api/students")
	public List<Student> getAllstudents() {
		
		List<Student> students= StudentDao.getAllStudents();
		System.out.println("Student Data"+students.get(0).getFirstName());
		return students;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/api/student/{id}")
	public Student getStudentById(@PathVariable int id) {
		
		Student student =StudentDao.getStudentById(id);
		return student;
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/api/student")
	public void AddStudent(@RequestBody Student student) {
		
		StudentDao.AddStudent(student);
		System.out.println("Record Inserted Succesfully");
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/api/student/{id}")
	public void updateStudent(@RequestBody Student student,@PathVariable int id) {
		
		StudentDao.updateStudent(student,id);
		System.out.println("Record Inserted Succesfully");
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value="/api/student/{id}")
	public void deleteStudent(@PathVariable int id) {
		
		StudentDao.deleteStudent(id);
		System.out.println("Record Inserted Succesfully");
	}
	
}
