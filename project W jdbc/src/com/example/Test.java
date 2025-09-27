package com.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r= new ClassPathResource("applicationcontext.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		
		EmployeeDao dao= (EmployeeDao)factory.getBean("edao");
		dao.save(new Employee(10,"vk",44000));
		System.out.println("success");

	}

}
