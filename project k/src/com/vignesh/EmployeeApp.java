package com.vignesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"Employeebeans.xml","Salarybean.xml"});
Employee employee = (Employee) context.getBean("employee");
System.out.println(employee);

	}

}
