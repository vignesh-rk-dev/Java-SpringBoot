package com.pack;

import org.springframework.stereotype.Repository;

//@Repository
public class UserRep {
	public String getdata (String uname,String pass) {
		String name= "admin";
		String password= "12345";
		if(uname.equals(name) && (pass.equals(password))) {
			return "Hi , " +uname+" Welcome to the portal !";
		}else {
			return "incorrect username or password";
		}
	}
}
