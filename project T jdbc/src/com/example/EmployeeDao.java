package com.example;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int updateEmployee(Employee e) {
		String query="update employee set name='"+e.getName()+"',salary='"+e.getSalary()+"'where id ='"+e.getId()+"'";
		return jdbcTemplate.update(query);
	}

}
