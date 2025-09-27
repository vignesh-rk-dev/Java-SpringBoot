package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		EmployeeDao dao =(EmployeeDao)ctx.getBean("edao");
		Employee e= new Employee();
		int status = dao.updateEmployee(new Employee (107,"vignesh",49000));
		System.out.println(status);

	}

}
