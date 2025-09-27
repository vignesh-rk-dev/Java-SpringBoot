package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		EmployeeDAO dao=(EmployeeDAO)ctx.getBean("edao");
		int status = dao.saveEmployee(new Employee(1002,"raj",90000));
		System.out.println(status);
	}

}
