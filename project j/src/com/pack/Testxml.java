package com.pack;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testxml {

	public static void main(String[] args) {				//main method excutes----1
		// TODO Auto-generated method stub					
		String username,password;
		Scanner scan= new Scanner(System.in);				//scanner takes user input  username and password---2
		System.out.println("Enter username :");
		username= scan.next();
		System.out.println("Enter password :");
		password= scan.next();
		scan.close();
		//load the Spring context from the xml configuration file
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");  //reads xml file ---3
		
		//get the UserServ bean from the Spring context
		Userserv userService =(Userserv) context.getBean("userServ");
		
		//call the service method to get user information
		System.out.println(userService.getUserInfo(username, password));
		
	}

}
