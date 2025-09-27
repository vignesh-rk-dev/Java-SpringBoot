package pack;

import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		String username,password;
		UserRep rep = new UserRep();
		//manual injecting the userrepository into userservice
		UserServ s= new UserServ(rep);
		Scanner x= new Scanner(System.in);
		System.out.println("Enter the User Name :");
		username= x.next();
		System.out.println("Enter the Password :");
		password = x.next();
		//calling service methods
		System.out.println(s.getUserInfo(username, password));

	}

}
