package com.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context =  new ClassPathXmlApplicationContext("app.xml");
		
		context.start();
		
		Helloworld obj = (Helloworld) context.getBean("helloworld");
		obj.getMessage();
		
		context.stop();
		
		context.close();

	}

}
