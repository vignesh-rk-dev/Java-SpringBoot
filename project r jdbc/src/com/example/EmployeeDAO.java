package com.example;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO {
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate (JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	public int saveEmployee(Employee e)
	{
		String Query = "insert into employee values(" + e.getId() + ",'" + e.getName() + "'," + e.getSalary() + ")";
		return jdbcTemplate.update(Query);

		
	}
}
