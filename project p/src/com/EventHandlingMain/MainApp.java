package com.EventHandlingMain;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.EventHandling.CustomEventPublisher;

public class MainApp {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("App01.xml");
		
		CustomEventPublisher cep = (CustomEventPublisher)context.getBean("customEventPublisher");
		
		cep.publish();
		cep.publish();

	}

}
