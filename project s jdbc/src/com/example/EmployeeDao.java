package com.example;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	private JdbcTemplate  jdbcTemplate;
public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
{
	this.jdbcTemplate = jdbcTemplate;
}
public int deleteEmployee(Employee e)
{
	String query ="delete from employee where id ='"+e.getId()+"'";
	return jdbcTemplate.update(query);
}
}
