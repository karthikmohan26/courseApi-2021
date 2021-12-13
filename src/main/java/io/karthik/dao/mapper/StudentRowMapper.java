package io.karthik.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import io.karthik.model.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student student = new Student();
		student.setId(rs.getInt("id"));
		student.setFirstName(rs.getString("firstname"));
		student.setLastName(rs.getString("lastname"));
		return student;
		
	}
}
