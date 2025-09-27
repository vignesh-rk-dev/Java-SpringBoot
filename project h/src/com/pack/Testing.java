package com.pack;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username,password;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the User name :");
		username=scan.next();
		System.out.println("Enter the password :");
		password=scan.next();
		
		//Initialize spring context using java-based configuration
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Get the UserServ bean (automatically scanned and registered)
		UserServ userService = context.getBean(UserServ.class);
		
		//call the service method to get user information
		System.out.println(userService.getUserInfo(username, password));
		

	}

}
