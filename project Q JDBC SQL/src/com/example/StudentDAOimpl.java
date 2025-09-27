package com.example;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class StudentDAOimpl implements StudentDAO {
	private JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
	
	public void insert (Student student) {
		
		String sql ="insert into student (rollno,name,address) values(?,?,?)";
		Object[] arg = {student.getRollno(),student.getName(),student.getAddress()};
		int noOfRowInserted = jdbcTemplate.update(sql,arg);
		System.out.println("No of row inserted is " + noOfRowInserted);
	}
	public DataSource getDataSource() {
		String url = "jdbc:mysql://localhost:3306/school";
		String username="root";
		String password="";
		DataSource dataSource=new DriverManagerDataSource(url,username,password);
		return dataSource;
	}
}
