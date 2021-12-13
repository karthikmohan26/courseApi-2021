package io.karthik.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import io.karthik.dao.mapper.StudentRowMapper;
import io.karthik.model.Student;

@Repository
public class StudentDao {
	
	
	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;
	
	private static String LIST_OF_STUDENTS="Select * from Student";
	private static String GET_STUDENT_BY_ID="Select * from Student where id=?";
	private static String INSERT_STUDENT="Insert into Student(id,firstname,lastname)values(?,?,?)";
    private static String UPDATE_STUDENT="Update Student set firstname=?, lastname=? where id=?";
    private static String DELETE_STUDENT="Delete from Student where id=?";
	
	public DataSource getDataSource() {
		return dataSource;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<Student> getAllStudents() {
		
		
		return jdbcTemplate.query(LIST_OF_STUDENTS, new StudentRowMapper());
		
	}
	
	public Student getStudentById(int id) {
		
	  return jdbcTemplate.queryForObject(GET_STUDENT_BY_ID, 
			  new Object[] {id}, new StudentRowMapper());	
	}

	public void AddStudent(Student student) {
		jdbcTemplate.update(INSERT_STUDENT, 
				new Object[] {student.getId(),student.getFirstName(),student.getLastName()});
	}

	public void updateStudent(Student student, int id) {

		jdbcTemplate.update(UPDATE_STUDENT, new Object[] {student.getFirstName(),student.getLastName(),id});
	}

	public void deleteStudent( int id) {

		jdbcTemplate.update(DELETE_STUDENT, new Object[] {id});
	}

	

}
