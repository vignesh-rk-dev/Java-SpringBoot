package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext sct= new ClassPathXmlApplicationContext("applicationcontext.xml");
		EmployeeDao dd= (EmployeeDao)sct.getBean("edao");
		dd.saveEmployeeByPreparedStatement (new Employee(106,"jai",890000));
		System.out.println("successfully created");
	}

}
