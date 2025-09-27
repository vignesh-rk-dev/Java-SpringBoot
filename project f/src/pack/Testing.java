package pack;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username,password;
		Scanner x= new Scanner(System.in);
		System.out.println("Enter the User name:");
		username=x.next();
		System.out.println("Enter the password:");
		password=x.next();
		//manually create spring application context with bean.xml
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		//get UserService bean from the context
		UserServ e=context.getBean("u",UserServ.class);
		//calling service methods
		System.out.println(e.getUserInfo(username,password));
		

	}

}
