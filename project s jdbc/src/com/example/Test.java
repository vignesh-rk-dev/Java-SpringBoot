package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		EmployeeDao dao =(EmployeeDao)ctx.getBean("edao");
		Employee e = new Employee();
		e.setId(1002);
		int status = dao.deleteEmployee(e);
		System.out.println(status);

	}

}
